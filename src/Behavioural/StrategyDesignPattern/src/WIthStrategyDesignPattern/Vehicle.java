package WIthStrategyDesignPattern;


import WIthStrategyDesignPattern.Strategy.DriveStrategy;

import java.sql.Driver;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    //this is known as constructor injection;
    Vehicle(DriveStrategy driverObj){
        this.driveStrategyObj=driverObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}

