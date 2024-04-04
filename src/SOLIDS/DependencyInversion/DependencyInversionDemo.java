package SOLIDS.DependencyInversion;
import SOLIDS.DependencyInversion.DependencyInversionNonViolated.*;

public class DependencyInversionDemo {
    public static void main(String[] args) {
        // Using LightBulb
        Switchable lightBulb = new LightBulb();
        Switch lightSwitchForBulb = new Switch(lightBulb);
        lightSwitchForBulb.press();

        // Using Fan
        Switchable fan = new Fan();
        Switch lightSwitchForFan = new Switch(fan);
        lightSwitchForFan.press();

        Switchable heater = new Heater();
        Switch heaterSwitch = new Switch(heater);
        heaterSwitch.press();
    }
}