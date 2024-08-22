package AbstractFactoryPattern;

public class OrdinaryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String model) {
        return switch (model){
            case "SUZUKI" -> new Suzuki();
            case "RENAULT" -> new Renault();
            default -> null;
        };
    }
}
