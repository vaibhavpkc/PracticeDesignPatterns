package WIthStrategyDesignPattern;


import WIthStrategyDesignPattern.Strategy.DriveStrategy;

import java.sql.Driver;

/**
 * Strategy design pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients who use it.
 */
public class Vehicle {

    //interface object called below. Injection of encapsulated object.
    DriveStrategy driveStrategyObj;

    //this is known as constructor injection;
    Vehicle(DriveStrategy driverObj){
        this.driveStrategyObj=driverObj;
    }

    // DriverStrategy is the encapsulated class of the driver strategy family.
    //We are delegating the drive method functionality to be handled by the driver strategy class here.

    public void drive(){
        driveStrategyObj.drive();
    }
}

