package Patterns.StrategyPattern.With;

import Patterns.StrategyPattern.With.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
