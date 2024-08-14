package DecoratorDesignPattern;

public class Farmhouse extends BasePizza{
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public void receipt(){
        System.out.println("Final Amount: "+this.cost());
    }
}
