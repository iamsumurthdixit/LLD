package Systems.ParkingLot.Strategies;

import Systems.ParkingLot.ParkingSpot;
import Systems.ParkingLot.TwoWheelerSpot;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot() {
        return new TwoWheelerSpot();
    }
}
