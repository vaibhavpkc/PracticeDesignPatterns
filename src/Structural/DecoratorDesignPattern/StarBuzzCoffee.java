package Structural.DecoratorDesignPattern;

import Structural.DecoratorDesignPattern.BaseClasses.Beverage;
import Structural.DecoratorDesignPattern.ChildClasses.Coffee.DarkRoast;
import Structural.DecoratorDesignPattern.ChildClasses.Coffee.Espresso;
import Structural.DecoratorDesignPattern.ChildClasses.Coffee.HouseBlend;
import Structural.DecoratorDesignPattern.ChildClasses.Condiments.Mocha;
import Structural.DecoratorDesignPattern.ChildClasses.Condiments.Soy;
import Structural.DecoratorDesignPattern.ChildClasses.Condiments.Whip;

/**
 * The Mocha class, for instance, extends Beverage and has its own getDescription() and cost() methods.
 * When you wrap Mocha around DarkRoast, you create a new object that represents a "DarkRoast with Mocha."
 * Then, you can wrap another Mocha or a Whip around this new object,
 * creating a chain of decorators that modify the final description and cost of the beverage.
 *
 * The recursion here is not explicit but is achieved through the composition and method overriding in the decorator classes,
 * allowing you to add condiments in a flexible and extensible manner while dynamically altering the behavior of the beverages at runtime
 *
 *
 * Understanding:
 * beverage2.cost() is actually new Whip(new Mocha(new Mocha(new DarkRoast()))).cost();
 * this means that the whip object will call cost method first. Inside the cost method it will call beverage.cost()--> which will call Mocha object and so on.
 * This will in turn reach DarkRoast.cost() and start returning recursively the cost after addition
 * one by one until it reaches Whip object again and give the final result.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ "$" +beverage.cost());

        Beverage beverage2 = new DarkRoast();
        //wrapping the Beverage object with a Mocha.
        beverage2 = new Mocha(beverage2);
        //wrapping the Beverage object with a second Mocha.
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+ "$"+beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
