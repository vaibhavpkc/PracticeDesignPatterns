package Creational.AbstractFactory.Example2.PizzaStore;

import Creational.AbstractFactory.Example2.PizzaType.PepperoniPizza;
import Creational.AbstractFactory.Example2.Pizza;
import Creational.AbstractFactory.Example2.PizzaIngredientFactory.PizzaIngredientFactory;
import Creational.AbstractFactory.Example2.PizzaType.CheesePizza;
import Creational.AbstractFactory.Example2.PizzaType.ClamPizza;
import Creational.AbstractFactory.Example2.PizzaIngredientFactory.UdaipurPizzaIngredientFactory;
import Creational.AbstractFactory.Example2.PizzaType.VeggiePizza;


/**
 * Concrete Class of Creator/factory abstract class.
 * Only the concrete class knows of how to create concrete products.
 */
public class UdaipurStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        /**
         * The ingredientFactory is going to store the whole ingredients which will make the pizza.
         * But the ingredients will be given to the generic classes so that the procedure to prepare pizzas
         * remain the same set by the franchise across all the pizza stores across regions.
         * This gives more ownership to the brand or the owner so that the franchise still
         * works in the same way as the guidelines set by the main branch.
         */
        PizzaIngredientFactory ingredientFactory = new UdaipurPizzaIngredientFactory();

        if (item.equals("cheese")) {
            //Creates a instance of Pizza that is composed with the Udaipur Ingredient Factory.
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Udaipur Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Udaipur Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Udaipur Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Udaipur Style Pepperoni Pizza");
        }
        return pizza;
    }
}
