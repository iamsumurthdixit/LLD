package Systems.ParkingLot;

import Systems.ParkingLot.Strategies.MinutePricingStrategy;

public class FourWheelerCost extends CostComputation{
    public FourWheelerCost() {
        super(new MinutePricingStrategy());
    }
}
