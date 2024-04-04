package Creational.AbstractFactory.Example2.PizzaIngredientFactory;

import Creational.AbstractFactory.Example2.BaseClasses.*;

/**
 * Ingredient abstract class which contains the methods which are implemented by the implementing classes.
 */
public abstract class PizzaIngredientFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract Veggies[] createVeggies();
    public abstract Pepperoni createPepperoni();
    public abstract Clams createClam();
}
