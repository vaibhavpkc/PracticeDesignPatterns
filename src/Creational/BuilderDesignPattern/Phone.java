package Creational.BuilderDesignPattern;

public class Phone {
    private String OS;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(String OS, int ram, String processor, double screenSize, int battery) {
        super();
        this.OS = OS;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
//inner class for implementation of builder design pattern
    public static class PhoneBuilder {
        private String OS;
        private int ram;
        private String processor;
        private double screenSize;
        private int battery;

        public PhoneBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public PhoneBuilder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        //    getPhone method has the constructor of the main class.
        public Phone getPhone() {
            return new Phone(OS, ram, processor, screenSize, battery);
        }
    }


}
