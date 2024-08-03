package Patterns.StrategyPattern;

import Patterns.StrategyPattern.With.OffRoadVehicle;
import Patterns.StrategyPattern.With.PassengerVehicle;
import Patterns.StrategyPattern.With.SportsVehicle;
import Patterns.StrategyPattern.With.Vehicle;

public class StrategyDriverCode {
    public void driverFunction() {
        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive(); // Normal drive capability
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive(); // Sports drive capability
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive(); // Sports drive capability
    }
}
