package Systems.ParkingLot;


import Systems.ParkingLot.Strategies.DefaultParkingStrategy;

import java.util.ArrayList;

public class TwoWheelerManager extends ParkingSpotManager{
    public TwoWheelerManager() {
        super(new ArrayList<>(400), new DefaultParkingStrategy());
    }
}
