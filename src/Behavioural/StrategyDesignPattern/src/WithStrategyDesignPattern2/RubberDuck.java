package WithStrategyDesignPattern2;

import WithStrategyDesignPattern2.Strategy.FlyNoWay;
import WithStrategyDesignPattern2.Strategy.FlyWithWings;
import WithStrategyDesignPattern2.Strategy.Quack;
import WithStrategyDesignPattern2.Strategy.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehaviour= new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public void display() {
        System.out.println("I'm a RubberDuck");
    }
}
