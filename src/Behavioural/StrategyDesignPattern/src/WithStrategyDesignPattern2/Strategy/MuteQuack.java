package WithStrategyDesignPattern2.Strategy;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I don't quack.");
    }
}
