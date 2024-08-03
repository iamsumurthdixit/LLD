package Systems.ParkingLot.Strategies;

import Systems.ParkingLot.Ticket;

public interface PricingStrategy {
    int price(Ticket ticket);
}
