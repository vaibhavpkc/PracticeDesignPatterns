package Structural.DecoratorDesignPattern.ChildClasses.Coffee;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
