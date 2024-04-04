package WithStrategyDesignPattern2.Strategy;

public class FlyWithWings implements FlyBehaviour{


    @Override
    public void fly() {
        System.out.println("I fly with my wings.");
    }
}
