package Patterns.StrategyPattern.Without;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() { // duplicate code as SportsVehicle
        System.out.println("Sports drive capability");
    }
}
