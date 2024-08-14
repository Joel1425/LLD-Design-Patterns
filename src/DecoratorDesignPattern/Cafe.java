package DecoratorDesignPattern;

public class Cafe {
    public static void main(String[] args) {
        // Margherita
        System.out.println("Margherita");
        BasePizza margherita = new Margherita();
        margherita.receipt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        // Farmhouse with extra cheese
        System.out.println("Farmhouse with extra cheese");
        BasePizza farmhouseExtraCheese = new ExtraCheese(new Farmhouse());
        farmhouseExtraCheese.receipt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        // Veg Delight with extra cheese and mushroom
        System.out.println("Veg Delight with extra cheese and mushroom ");
        BasePizza vegDelightExtraCheeseMushroom = new Mushroom(new ExtraCheese(new VegDelight()));
        vegDelightExtraCheeseMushroom.receipt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

    }
}
