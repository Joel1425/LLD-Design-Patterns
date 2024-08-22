package AbstractFactoryPattern;

public class Mercedes implements Vehicle{
    @Override
    public void getModel() {
        System.out.println("Mercedes Benz");
    }

    @Override
    public void getType() {
        System.out.println("Luxury Vehicle");
    }
}
