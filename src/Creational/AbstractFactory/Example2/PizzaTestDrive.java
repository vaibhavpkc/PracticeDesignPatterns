package Creational.AbstractFactory.Example2;

import Creational.AbstractFactory.Example2.PizzaStore.BangalorePizzaStore;
import Creational.AbstractFactory.Example2.PizzaStore.PizzaStore;
import Creational.AbstractFactory.Example2.PizzaStore.UdaipurStylePizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore blrStore = new BangalorePizzaStore();
		PizzaStore udrStore = new UdaipurStylePizzaStore();
 
		Pizza pizza = blrStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = udrStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = blrStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = udrStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = blrStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = udrStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = blrStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = udrStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
