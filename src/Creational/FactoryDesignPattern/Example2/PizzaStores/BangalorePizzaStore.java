package Creational.FactoryDesignPattern.Example2.PizzaStores;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;
import Creational.FactoryDesignPattern.Example2.Main.PizzaStore;
import Creational.FactoryDesignPattern.Example2.PizzaStoresStyle.*;

import static Creational.FactoryDesignPattern.Example2.PizzaStores.UdaipurStylePizzaStore.PIZZA_TYPES.*;

/**
 * Concrete Class of Creator/factory abstract class.
 * Only the concrete class knows of how to create concrete products.
 */

public class BangalorePizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals(CHEESE)) {
            return new BangaloreStyleCheesePizza();
        } else if (item.equals(VEGGIE)) {
            return new BangaloreStyleVeggiePizza();
        } else if (item.equals(FARMHOUSE)) {
            return new BangaloreStyleFarmhousePizza();
        } else if (item.equals(TANDOORIPANEER)) {
            return new BangaloreStyleTandooriPizza();
        } else return null;
    }
}