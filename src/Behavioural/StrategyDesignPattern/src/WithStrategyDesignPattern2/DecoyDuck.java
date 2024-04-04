package WithStrategyDesignPattern2;

import WithStrategyDesignPattern2.Strategy.FlyNoWay;
import WithStrategyDesignPattern2.Strategy.FlyWithWings;
import WithStrategyDesignPattern2.Strategy.MuteQuack;
import WithStrategyDesignPattern2.Strategy.Squeak;

public class DecoyDuck  extends Duck{
    public DecoyDuck(){
        flyBehaviour= new FlyNoWay();
        quackBehaviour = new Squeak();
    }
    public void display() {
        System.out.println("I'm a DecoyDuck");
    }
}
