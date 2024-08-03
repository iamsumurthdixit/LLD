package Systems.ParkingLot;

import Systems.ParkingLot.Enums.VehicleType;

public class Vehicle {
    int id;
    VehicleType vehicleType;

    public Vehicle(int id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
