package Creational.AbstractFactory.Example2.PizzaType;

import Creational.AbstractFactory.Example2.Pizza;
import Creational.AbstractFactory.Example2.PizzaIngredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    //The abstract class used the Pizza ingredient factory object to prepare the pizza.
    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory=ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
