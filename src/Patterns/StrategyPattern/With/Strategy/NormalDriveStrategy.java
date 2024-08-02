package Patterns.StrategyPattern.With.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
