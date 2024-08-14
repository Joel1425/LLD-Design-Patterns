package DecoratorDesignPattern;

public class VegDelight extends BasePizza{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public void receipt(){
        System.out.println("Final Amount: "+this.cost());
    }
}
