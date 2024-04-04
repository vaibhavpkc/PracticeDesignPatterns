package WithStrategyDesignPattern2;

    public class Demo {

        public static void main(String[] args) {
            Duck duck1 = new MallardDuck();
            duck1.display();
            Duck duck2 = new RedHeadDuck();
            duck2.display();
            duck2.performQuack();
            Duck duck3 = new DecoyDuck();
            duck3.display();
            duck3.performFly();
        }
    }
