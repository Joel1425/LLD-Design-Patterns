package AbstractFactoryPattern;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle( String model) {
        return switch (model) {
            case "BMW" -> new BMW();
            case "MERCEDES" -> new Mercedes();
            default -> null;
        };
    }
}
