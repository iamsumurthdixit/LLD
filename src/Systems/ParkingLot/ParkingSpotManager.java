package Systems.ParkingLot;

import Systems.ParkingLot.Strategies.ParkingStrategy;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpots; // has-a
    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    ParkingSpot findParkingSpace() {
        return parkingStrategy.findParkingSpot();
    }

    void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.parkVehicle(vehicle);
    }

    void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }
}
