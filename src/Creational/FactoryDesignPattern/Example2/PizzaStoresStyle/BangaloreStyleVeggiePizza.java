package Creational.FactoryDesignPattern.Example2.PizzaStoresStyle;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;
/**
 * Concrete classes of Products. These extend the Product abstract class so that the creator classes can refer them using Product abstract class.
 */
public class BangaloreStyleVeggiePizza extends Pizza {

    public BangaloreStyleVeggiePizza() {

        name = "Bangalore Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
