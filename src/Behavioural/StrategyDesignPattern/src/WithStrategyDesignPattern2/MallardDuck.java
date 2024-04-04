package WithStrategyDesignPattern2;

import WithStrategyDesignPattern2.Strategy.FlyWithWings;
import WithStrategyDesignPattern2.Strategy.Squeak;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviour= new FlyWithWings();
        quackBehaviour = new Squeak();
    }
    public void display() {
        System.out.println("I'm a MallardDuck");
    }
}
