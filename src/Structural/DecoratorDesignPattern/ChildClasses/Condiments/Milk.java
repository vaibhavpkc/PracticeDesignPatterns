package Structural.DecoratorDesignPattern.ChildClasses.Condiments;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;
import Structural.DecoratorDesignPattern.BaseClasses.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
