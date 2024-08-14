package DecoratorDesignPattern;

public class Margherita extends BasePizza{
    @Override
    public int cost() {
        return 150;
    }
    @Override
    public void receipt(){
        System.out.println("Final Amount: "+this.cost());
    }
}
