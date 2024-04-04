package Structural.DecoratorDesignPattern.BaseClasses;

public abstract class CondimentDecorator extends Beverage{

    public Beverage beverage;
    public abstract String getDescription();
}
