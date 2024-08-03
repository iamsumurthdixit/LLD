package Systems.ParkingLot;


import Systems.ParkingLot.Strategies.NearestEntryParkingStrategy;

import java.util.ArrayList;

public class FourWheelerManager extends ParkingSpotManager{
    public FourWheelerManager() {
        super(new ArrayList<>(300), new NearestEntryParkingStrategy());
    }
}
