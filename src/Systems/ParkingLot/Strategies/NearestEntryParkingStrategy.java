package Systems.ParkingLot.Strategies;

import Systems.ParkingLot.FourWheelerSpot;
import Systems.ParkingLot.ParkingSpot;

public class NearestEntryParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot() {
        return new FourWheelerSpot();
        // return like maintaining a minHeap of all the ParkingSpot at each EntryGate
    }
}
