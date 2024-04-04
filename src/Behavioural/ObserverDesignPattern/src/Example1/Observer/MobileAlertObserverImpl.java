package Example1.Observer;

import Example1.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage(userName, observable, "product is in stock hurry up!");
    }

    private void sendMessage(String userName, StockObservable observable, String msg) {
        System.out.println("msg sent to:" + userName);
        System.out.println("Stock count: " + observable.getStockCount());
    }
}
