package Systems.CarRental.Product;

import java.util.Date;

public class Vehicle {
    int vehicleID;
    VehicleType vehicleType;
    Status status;
    int vehicleNumber;
    Date manufacturingDate;
    int kmDriven;
    int cc;
    int average;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }
    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }
}
