package Example1;

import Example1.Observable.IphoneObservableImpl;
import Example1.Observable.StockObservable;
import Example1.Observer.EmailAlertObserverImpl;
import Example1.Observer.MobileAlertObserverImpl;
import Example1.Observer.NotificationAlertObserver;


/**
 * There are two entities in Observer pattern, Observable and Observer.
 *
 * Observable is the interface which notifies all the observer whenever the state changes of a particular item.
 * Observable interface has:
 * 1. add
 * 2.remove and
 * 3. remove methods
 *
 * Observer interface has:
 * 1. update method.
 *
 *
 * Understanding:
 * As soon as the product comes into the warehouse the product count has to be increased and the subscribers have to be informed.
 * So, therefore within the setStockCount method we are internally calling --> notifySubscribers--> which interanlly calls update method to notify people.
 */
public class Store {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("vaibhav@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("apoorva@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("shruti@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
    }

}