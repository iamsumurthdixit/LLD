package Systems.ParkingLot.Strategies;

import Systems.ParkingLot.Ticket;

public class MinutePricingStrategy implements PricingStrategy{
    @Override
    public int price(Ticket ticket) {
        return (int) (ticket.getEntryTime() - 99375L) * 10;
    }
}
