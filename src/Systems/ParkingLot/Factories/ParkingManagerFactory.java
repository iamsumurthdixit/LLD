package Systems.ParkingLot.Factories;

import Systems.ParkingLot.Enums.VehicleType;
import Systems.ParkingLot.FourWheelerManager;
import Systems.ParkingLot.ParkingSpotManager;
import Systems.ParkingLot.TwoWheelerManager;
import Systems.ParkingLot.Vehicle;

public class ParkingManagerFactory {
    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        VehicleType vehicleType = vehicle.getVehicleType();

        return switch (vehicleType) {
            case TWO_WHEELER -> new TwoWheelerManager();
            case FOUR_WHEELER -> new FourWheelerManager();
            default -> null;
        };
    }
}
