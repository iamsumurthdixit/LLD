package Patterns.FactoryPattern.AbstractFactory;

public class OrdinaryFactory implements VehicleFactoryType {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "OrdinaryVehicleA" -> new OrdinaryVehicleA();
            case "OrdinaryVehicleB" -> new OrdinaryVehicleB();
            default -> null;
        };
    }
}
