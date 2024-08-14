package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    int extraAmount;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
        this.extraAmount = 20;
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
