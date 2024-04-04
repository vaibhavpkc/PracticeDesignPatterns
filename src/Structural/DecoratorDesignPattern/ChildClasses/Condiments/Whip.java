package Structural.DecoratorDesignPattern.ChildClasses.Condiments;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;
import Structural.DecoratorDesignPattern.BaseClasses.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
