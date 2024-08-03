package Systems.ParkingLot.Factories;

import Systems.ParkingLot.CostComputation;
import Systems.ParkingLot.Enums.VehicleType;
import Systems.ParkingLot.FourWheelerCost;
import Systems.ParkingLot.Ticket;
import Systems.ParkingLot.TwoWheelerCost;

public class CostComputationFactory {
    public CostComputation getCostComputation(Ticket ticket) {
        VehicleType vehicleType = ticket.getVehicle().getVehicleType();

        return switch (vehicleType) {
            case TW0_WHEELER -> new TwoWheelerCost();
            case FOUR_WHEELER -> new FourWheelerCost();
            default -> null;
        };
    }
}
