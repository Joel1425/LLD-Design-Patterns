package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory luxuryFactory = new LuxuryFactory();
        VehicleFactory ordinaryFactory = new OrdinaryFactory();

        // Getting a MERCEDES Vehicle
        luxuryFactory.getVehicle("MERCEDES").getType();
        luxuryFactory.getVehicle("MERCEDES").getModel();

        // Getting a SUZUKI Vehicle
        ordinaryFactory.getVehicle("SUZUKI").getType();
        ordinaryFactory.getVehicle("SUZUKI").getModel();


    }
}
