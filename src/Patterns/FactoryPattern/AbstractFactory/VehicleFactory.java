package Patterns.FactoryPattern.AbstractFactory;

public class VehicleFactory {
    public VehicleFactoryType getVehicleFactoryType(String type) {
        return switch (type) {
            case "Luxury" -> new LuxuryFactory();
            case "Ordinary" -> new OrdinaryFactory();
            default -> null;
        };
    }
}
