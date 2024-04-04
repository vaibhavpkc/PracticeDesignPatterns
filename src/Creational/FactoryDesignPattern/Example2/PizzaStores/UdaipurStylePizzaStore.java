package Creational.FactoryDesignPattern.Example2.PizzaStores;

import Creational.FactoryDesignPattern.Example2.Main.Pizza;
import Creational.FactoryDesignPattern.Example2.Main.PizzaStore;
import Creational.FactoryDesignPattern.Example2.PizzaStoresStyle.UdaipurStyleCheesePizza;
import Creational.FactoryDesignPattern.Example2.PizzaStoresStyle.UdaipurStyleFarmhousePizza;
import Creational.FactoryDesignPattern.Example2.PizzaStoresStyle.UdaipurStyleTandooriPizza;
import Creational.FactoryDesignPattern.Example2.PizzaStoresStyle.UdaipurStyleVeggiePizza;


/**
 * Concrete Class of Creator/factory abstract class.
 * Only the concrete class knows of how to create concrete products.
 */
public class UdaipurStylePizzaStore extends PizzaStore {
    //Using enums to make the types typesafe.
    enum PIZZA_TYPES{
        CHEESE, VEGGIE, FARMHOUSE,TANDOORIPANEER
    }
    public Pizza createPizza(String item){
        if(item.equals(PIZZA_TYPES.CHEESE)){
            return new UdaipurStyleCheesePizza();
        }else if(item.equals(PIZZA_TYPES.VEGGIE)){
            return new UdaipurStyleVeggiePizza();
        }else if(item.equals(PIZZA_TYPES.FARMHOUSE)){
            return new UdaipurStyleFarmhousePizza();
        }else if(item.equals(PIZZA_TYPES.TANDOORIPANEER)){
            return new UdaipurStyleTandooriPizza();
        }else return null;
    }
}
