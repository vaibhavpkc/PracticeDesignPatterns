package WithStrategyDesignPattern2;

import WithStrategyDesignPattern2.Strategy.FlyBehaviour;
import WithStrategyDesignPattern2.Strategy.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void Duck() {

    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehaviour = fb;
    }
    public void setQuackBehavior(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}
