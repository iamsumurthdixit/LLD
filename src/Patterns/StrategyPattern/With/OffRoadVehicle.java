package Patterns.StrategyPattern.With;

import Patterns.StrategyPattern.With.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
