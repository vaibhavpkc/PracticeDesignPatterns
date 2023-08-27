package Creational.BuilderDesignPattern;

public class Shop {
    public static void main(String[] args) {
//        Builder pattern giving us the ability to fill the values in any order.
//        Also, if any values are not filled it will take the default value and return the object.
        Phone p = new Phone.PhoneBuilder().setOS("Android")
                .setBattery(5100).getPhone();

        System.out.println(p);
    }
}
