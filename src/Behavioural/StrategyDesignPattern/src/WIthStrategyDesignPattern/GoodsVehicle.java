package WIthStrategyDesignPattern;

import WIthStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
