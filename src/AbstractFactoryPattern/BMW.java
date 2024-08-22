package AbstractFactoryPattern;

public class BMW implements Vehicle{
    @Override
    public void getModel() {
        System.out.println("BMW");
    }

    @Override
    public void getType() {
        System.out.println("Luxury Vehicle");
    }
}
