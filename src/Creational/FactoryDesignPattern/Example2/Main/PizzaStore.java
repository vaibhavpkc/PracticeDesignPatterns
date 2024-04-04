package Creational.FactoryDesignPattern.Example2.Main;
/**
 *Creator/factory abstract class.
 */

public abstract class PizzaStore {

    /**
     * A factory method handles object creation and encapsulates it in a
     * subclass. This decouples the client code in the superclass from the
     * object creation code in the subclass.
     */

    //The orderPizza method is not aware of the pizza object which is getting prepared because of abstraction.
    //A factory method isolates the client (the code in the superclass, like orderPizza()) from knowing what kind of concrete
    // product is actually created.
    public Pizza orderPizza(String type) {
        Pizza pizza;
        //the below createPizza method is made abstract for it to be implemented by the implementing class.
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}

