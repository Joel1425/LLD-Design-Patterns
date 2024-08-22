package AbstractFactoryPattern;

public class Suzuki implements Vehicle{
    @Override
    public void getModel() {
        System.out.println("Maruti Suzuki");
    }

    @Override
    public void getType() {
        System.out.println("Ordinary Vehicle");
    }
}
