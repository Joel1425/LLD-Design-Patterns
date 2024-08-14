package DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    int extraAmount;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
        this.extraAmount = 10;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + this.extraAmount;
    }

    @Override
    public void receipt() {
        System.out.println("Final Amount: "+this.cost());
    }
}
