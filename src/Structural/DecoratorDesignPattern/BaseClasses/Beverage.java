package Structural.DecoratorDesignPattern.BaseClasses;

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
