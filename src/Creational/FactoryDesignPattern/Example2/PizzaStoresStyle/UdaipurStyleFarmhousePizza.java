package Creational.FactoryDesignPattern.Example2.PizzaStoresStyle;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;
/**
 * Concrete classes of Products. These extend the Product abstract class so that the creator classes can refer them using Product abstract class.
 */
public class UdaipurStyleFarmhousePizza extends Pizza {
    public UdaipurStyleFarmhousePizza() {
        name = "Udaipur Style Farmhouse Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Farmhouse from Long Island Sound");
    }
}
