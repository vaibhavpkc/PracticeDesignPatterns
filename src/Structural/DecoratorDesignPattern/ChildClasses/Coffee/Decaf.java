package Structural.DecoratorDesignPattern.ChildClasses.Coffee;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description="Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
