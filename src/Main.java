import Solid.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new MotorCycle());
        vehicles.add(new Bicycle());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new Car());
        engineVehicles.add(new MotorCycle());
        for (EngineVehicle engineVehicle : engineVehicles) {
            System.out.println(engineVehicle.hasEngine().toString());
        }
    }
}