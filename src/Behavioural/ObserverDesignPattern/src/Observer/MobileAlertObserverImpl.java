package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(userName, "product is in stock hurry up!");
    }

    private void sendMail(String userName, String msg) {
        System.out.println("msg sent to:" + userName);
    }
}
