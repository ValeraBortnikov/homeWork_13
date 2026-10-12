//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product gameProduct = new Product(1, "GTA6", 7_513, "Компьютерная игра");
        System.out.println(gameProduct.toString());

        Product itProduct = new Product(2, "ОС Windows", 8_700, "Операционные системы");
        System.out.println(itProduct.toString());

        Product secondGameProduct = new Product(1, "GTA6", 7_513, "Компьютерная игра");
        System.out.println(secondGameProduct.toString());

        System.out.println(gameProduct.equals(itProduct));
        System.out.println(gameProduct.equals(secondGameProduct));
        System.out.println(itProduct.equals(secondGameProduct));

        Order firstOrder = new Order("Михайлов В.В.", new Product[]{gameProduct});
        System.out.println(firstOrder.toString());

        Order secondOrder = new Order("Миронов М. М.", new Product[]{itProduct});
        System.out.println(secondOrder.toString());

        Order thirdOrder = new Order("Никитин Ж. Н.", new Product[]{secondGameProduct});
        System.out.println(thirdOrder.toString());

        System.out.println(firstOrder.equals(secondOrder));
        System.out.println(firstOrder.equals(thirdOrder));
        System.out.println(secondOrder.equals(thirdOrder));


    }
}