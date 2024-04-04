package WithStrategyDesignPattern2.Strategy;

public class Squeak implements QuackBehaviour{


    @Override
    public void quack() {
        System.out.println("I squeak.");
    }
}
