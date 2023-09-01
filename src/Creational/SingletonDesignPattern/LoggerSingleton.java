package Creational.SingletonDesignPattern;

/**
 * The Singleton design pattern is a creational design pattern
 * that ensures a class has only one instance and provides a
 * global point of access to that instance.
 * This pattern restricts the instantiation of a class to a single object
 * and is particularly useful when exactly one object is needed to coordinate actions
 * across the system, such as controlling access to a shared resource or managing a configuration.
 *
 *
 *
 * It can only contain one public method, and the instance is a private instance.
 */

public class LoggerSingleton {
/**    not thread safe. This is Eager Loading which is commented.*/
/*
    private static LoggerSingleton instance = new LoggerSingleton();

    private LoggerSingleton(){

    }

    public static LoggerSingleton getInstance(){
        return instance;
    }
*/
    /**    not thread safe. This is Lazy Loading which is commented.*/
//use of volatile in the object description.
    private static volatile LoggerSingleton instance = null;

//    with the use of reflection the constructor can be accessed. So, keeping this in check here.
    private LoggerSingleton(){
        if(instance!=null){
            throw new RuntimeException("Please don't try to be smart.");
        }

    }

    public static LoggerSingleton getInstance(){
        if(instance == null){
//            the below code block ensures that no two threads are initializing the instance at the same time. It locks the resource for a thread in execution.
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
                return instance;
            }
        }
    return instance;
    }

    /**
     * below method helps to keep the Singleton property intact by returning the orignal element
     * rather than the copy of the element
     * while making the class serializable.
     * @return
     */

    protected Object readResolve() {
        return instance;
    }


}
