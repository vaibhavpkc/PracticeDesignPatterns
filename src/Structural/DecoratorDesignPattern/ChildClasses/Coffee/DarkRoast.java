package Structural.DecoratorDesignPattern.ChildClasses.Coffee;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description="Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
