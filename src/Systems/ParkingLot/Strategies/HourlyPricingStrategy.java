package Systems.ParkingLot.Strategies;

import Systems.ParkingLot.Ticket;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public int price(Ticket ticket) {
        return (int) (ticket.getEntryTime() - 76576L) * 60;
    }
}
