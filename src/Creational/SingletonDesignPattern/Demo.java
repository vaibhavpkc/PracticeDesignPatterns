package Creational.SingletonDesignPattern;

public class Demo {

    public static void main(String[] args) {
        LoggerSingleton singletonObj = LoggerSingleton.getInstance();

        System.out.println(singletonObj);

        LoggerSingleton singletonObj2 = LoggerSingleton.getInstance();

        System.out.println(singletonObj2);

    }

}
