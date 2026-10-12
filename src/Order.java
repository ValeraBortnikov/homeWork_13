
import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] product) {
        this.customer = customer;
        basket = product;
    }

    @Override
    public String toString() {
        return "У клиента " + this.customer + " в корзине " + Arrays.toString(this.basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) return false;
        if (basket.length != order.basket.length) return false; //Arrays.equals сверит длину
        //if (!Arrays.equals(basket, order.basket)) return false; //Предпочел бы такой подход, но в задании через цикл
        boolean equalArray = true;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                if (order.basket[i] != null) equalArray = false;
            } else if (!basket[i].equals(order.basket[i])) {
                return equalArray = false;
            }
        }
        if (!equalArray) return false;
        return true;
    }
}
