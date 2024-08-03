package Systems.ParkingLot;

import Systems.ParkingLot.Factories.CostComputationFactory;
import Systems.ParkingLot.Factories.ParkingManagerFactory;

public class ExitGate {
    CostComputationFactory costComputationFactory = new CostComputationFactory();
    ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();

    CostComputation costComputation;
    ParkingSpotManager parkingSpotManager;
    // Payment paymentMethod; // for types of payment using strategy

    ExitGate(Ticket ticket) {
        costComputation = costComputationFactory.getCostComputation(ticket);
        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(ticket.getVehicle());
    }

    public int getCalculatedPrice(Ticket ticket) {
        return costComputation.getCost(ticket);
    }

    void removeParkingSpot(Ticket ticket) {
        parkingSpotManager.removeVehicle(ticket.getParkingSpot());
    }
}
