package WithStrategyDesignPattern2.Strategy;

public class Quack implements QuackBehaviour{


    @Override
    public void quack() {
        System.out.println("quacking");
    }
}
