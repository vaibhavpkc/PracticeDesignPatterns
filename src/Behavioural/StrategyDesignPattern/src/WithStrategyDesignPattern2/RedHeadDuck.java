package WithStrategyDesignPattern2;

import WithStrategyDesignPattern2.Strategy.FlyNoWay;
import WithStrategyDesignPattern2.Strategy.Squeak;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehaviour= new FlyNoWay();
        quackBehaviour = new Squeak();
    }
    public void display() {
        System.out.println("I'm a RedHeadDuck");
    }
}
