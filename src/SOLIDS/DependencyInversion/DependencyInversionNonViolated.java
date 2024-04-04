package SOLIDS.DependencyInversion;

public class DependencyInversionNonViolated {
    // Without Interface Declaration: Loosely coupled

    public static class LightBulb implements Switchable{
        @Override
        public void turnOn() {
            System.out.println("Light Bulb is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Light Bulb is OFF");
        }
    }

    public static class Fan implements Switchable{
        @Override
        public void turnOn() {
            System.out.println("Fan is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Fan is OFF");
        }
    }

    public static class Heater implements Switchable{

        @Override
        public void turnOn() {
            System.out.println("Heater is switched ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("Heater is switched OFF.");
        }
    }

    public static class Switch {
        private Switchable device;

        public Switch(Switchable device) {
            this.device = device;
        }

        public void press() {
            if (device != null) {
                device.turnOn();
            }
        }
    }
}
