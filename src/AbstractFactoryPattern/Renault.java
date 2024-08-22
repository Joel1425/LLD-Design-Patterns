package AbstractFactoryPattern;

public class Renault implements Vehicle{
    @Override
    public void getModel() {
        System.out.println("Renault");
    }

    @Override
    public void getType() {
        System.out.println("Ordinary Vehicle");
    }
}
