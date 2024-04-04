package Example1.Observer;

import Example1.Observable.StockObservable;

/**
 * In the below implementation we have created a global StockObservable variable in order for us to avoid the passing of Observable object in the update method as a parameter,
 * and to avoid the instanceof check once it reaches the update method. Instead, we have created a has a relationship with the observable class by
 * doing a constructor injection in the constructor of the implementing Observer class.
 */

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    //Constructor injection happening in the below constructor.
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update(){
        sendMail(emailId,observable,"product is in stock hurry up!");
    }

    private void sendMail(String emailId, StockObservable observable, String msg){
        System.out.println("Mail sent to:"+ emailId);
        System.out.println("Stock count:"+observable.getStockCount());
    }
}
