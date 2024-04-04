package Creational.FactoryDesignPattern.Example2.PizzaStoresStyle;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;
/**
 * Concrete classes of Products. These extend the Product abstract class so that the creator classes can refer them using Product abstract class.
 */
public class UdaipurStyleCheesePizza extends Pizza {
    public UdaipurStyleCheesePizza(){
        name = "Udaipur Sauce and Cheese Pizza";
        dough = "CheeseBurst";
        sauce = "Thousand Island";
        toppings.add("Grated Reggiano Cheese");
    }
}
