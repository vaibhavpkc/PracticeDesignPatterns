package Example1.Observable;

import Example1.Observer.NotificationAlertObserver;

/**
 * The observer pattern has the below methods: add, remove, notify methods declared.
 * Also, to set and get data set and get method implemented.
 *
 * We are not defining a list of Observer class here as in the interface the list becomes final and cannot be modified later as per the observer bean.
 */
public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockCount);

    public int getStockCount();
}
