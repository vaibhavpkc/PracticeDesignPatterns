package SOLIDS.DependencyInversion;

public class DependencyInversionViolation {
    //With Concrete Class Implementation:Tightly Coupled
    public class LightBulb {
        public void turnOn() {
            System.out.println("Light Bulb is ON");
        }

        public void turnOff() {
            System.out.println("Light Bulb is OFF");
        }
    }

   public class Switch {
        private LightBulb bulb;

        public Switch() {
            this.bulb = new LightBulb(); // Dependency on concrete implementation
        }

        public void press() {
            if (bulb != null) {
                bulb.turnOn();
            }
        }
    }

}
