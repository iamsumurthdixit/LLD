package Patterns.FactoryPattern.AbstractFactory;

public class LuxuryFactory implements VehicleFactoryType {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "LuxuryVehicleA" -> new LuxuryVehicleA();
            case "LuxuryVehicleB" -> new LuxuryVehicleB();
            default -> null;
        };
    }
}
