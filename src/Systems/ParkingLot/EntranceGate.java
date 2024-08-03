package Systems.ParkingLot;

import Systems.ParkingLot.Factories.ParkingManagerFactory;

public class EntranceGate {
    int id;
    ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
    ParkingSpotManager parkingSpotManager; // to be obtained from factory
    Ticket ticket;

//    ParkingSpot freeParkingSpot; this should be obtained form findParkingSpace()

    public EntranceGate(Vehicle vehicle) {
        id = 1;
        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicle);
    }

    ParkingSpot findParkingSpace() {
        return parkingSpotManager.findParkingSpace();
    }

    void bookParkingSpot(Vehicle vehicle) {
        parkingSpotManager.parkVehicle(findParkingSpace(), vehicle);
    }

    void generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        ticket = new Ticket(9374934, vehicle, parkingSpot);
    }
}
