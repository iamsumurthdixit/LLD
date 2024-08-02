package Patterns.StrategyPattern.With;

import Patterns.StrategyPattern.With.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject; // [dynamic] Vehicle "has-a" DriveStrategy
    // static would be : DriveStrategy driveObject = new SportsDriveStrategy();

    // this is constructor injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    public void drive() {
        driveObject.drive();
    }
}
