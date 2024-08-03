package Systems.ParkingLot;

import Systems.ParkingLot.Strategies.PricingStrategy;

public abstract class CostComputation {
    PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public int getCost(Ticket ticket) {
        return pricingStrategy.price(ticket);
    }
}
