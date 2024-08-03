package Patterns.FactoryPattern.AbstractFactory;

public class AbstractFactoryDriver {
    public static void driver() {
        VehicleFactory vehicleFactoryObject = new VehicleFactory();
        VehicleFactoryType luxuryFactory = vehicleFactoryObject.getVehicleFactoryType("Luxury");

        Vehicle luxuryVehicleA = luxuryFactory.getVehicle("LuxuryVehicleA");
        System.out.println(luxuryVehicleA.average()); // 20

        VehicleFactoryType ordinaryFactory = vehicleFactoryObject.getVehicleFactoryType("Ordinary");

        Vehicle ordinaryVehicleB = ordinaryFactory.getVehicle("OrdinaryVehicleB");
        System.out.println(ordinaryVehicleB.average()); // 200
    }
}
