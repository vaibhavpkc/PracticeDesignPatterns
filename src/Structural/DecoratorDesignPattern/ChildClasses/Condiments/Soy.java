package Structural.DecoratorDesignPattern.ChildClasses.Condiments;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;
import Structural.DecoratorDesignPattern.BaseClasses.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
