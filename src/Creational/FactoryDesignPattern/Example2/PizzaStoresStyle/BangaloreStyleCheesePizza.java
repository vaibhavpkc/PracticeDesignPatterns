package Creational.FactoryDesignPattern.Example2.PizzaStoresStyle;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;

/**
 * Concrete classes of Products. These extend the Product abstract class so that the creator classes can refer them using Product abstract class.
 */
public class BangaloreStyleCheesePizza extends Pizza {
    public BangaloreStyleCheesePizza() {
        name = "Bangalore Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}