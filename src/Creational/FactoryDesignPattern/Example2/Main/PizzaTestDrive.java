package Creational.FactoryDesignPattern.Example2.Main;

import Creational.FactoryDesignPattern.Example2.PizzaStores.BangalorePizzaStore;
import Creational.FactoryDesignPattern.Example2.PizzaStores.UdaipurStylePizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore bnStore = new BangalorePizzaStore();
        PizzaStore udrStore = new UdaipurStylePizzaStore();

        Pizza pizza = bnStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = udrStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = bnStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = udrStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = bnStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = udrStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = bnStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = udrStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

