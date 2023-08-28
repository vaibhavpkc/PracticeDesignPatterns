package WIthStrategyDesignPattern;

import WIthStrategyDesignPattern.Strategy.DriveStrategy;
import WIthStrategyDesignPattern.Strategy.SportsDriveStrategy;
public class OffroadVehicle  extends Vehicle {
    OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
