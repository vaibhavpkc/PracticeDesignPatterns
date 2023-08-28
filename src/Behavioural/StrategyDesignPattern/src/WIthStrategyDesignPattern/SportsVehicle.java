package WIthStrategyDesignPattern;

import WIthStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
