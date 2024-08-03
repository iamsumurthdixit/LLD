package Systems.ParkingLot;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle; // has-a
    int price;

    public ParkingSpot(int price) {
        this.id = 1;
        this.isEmpty = true;
        this.price = price;
    }

    void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
}
