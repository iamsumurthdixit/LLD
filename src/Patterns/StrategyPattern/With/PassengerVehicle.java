package Patterns.StrategyPattern.With;

import Patterns.StrategyPattern.With.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
