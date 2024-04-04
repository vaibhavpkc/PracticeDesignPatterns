package Creational.FactoryDesignPattern.Example2.PizzaStoresStyle;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;
/**
 * Concrete classes of Products. These extend the Product abstract class so that the creator classes can refer them using Product abstract class.
 */
public class UdaipurStyleTandooriPizza extends Pizza {
    public UdaipurStyleTandooriPizza() {
        name = "Udaipur Style Tandoori Paneer Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Paneer");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Capsicum");
        toppings.add("Red Pepper");
    }

}
