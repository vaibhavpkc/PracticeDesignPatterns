package Structural.DecoratorDesignPattern.ChildClasses.Coffee;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
