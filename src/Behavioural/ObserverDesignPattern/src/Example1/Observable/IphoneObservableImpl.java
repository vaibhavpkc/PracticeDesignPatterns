package Example1.Observable;

import Example1.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    //Declaring the observerList here.
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    //update method for the observers is being called here.
    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    //notify subscribers is being called here.
    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0)
            notifySubscribers();
        stockCount = newStockCount;
    }
}
