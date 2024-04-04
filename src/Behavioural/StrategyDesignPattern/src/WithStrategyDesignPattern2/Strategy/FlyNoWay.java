package WithStrategyDesignPattern2.Strategy;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I don't fly.");
    }
}
