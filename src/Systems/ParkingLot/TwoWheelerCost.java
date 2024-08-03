package Systems.ParkingLot;

import Systems.ParkingLot.Strategies.HourlyPricingStrategy;

public class TwoWheelerCost extends CostComputation{
    public TwoWheelerCost() {
        super(new HourlyPricingStrategy());
    }
}
