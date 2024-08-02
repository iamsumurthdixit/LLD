package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable; // Avoid using static in order to check against isInstance()

    // constructor injection for EmailAlertObservable "has-a" StockObservableImpl
    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId);
    }
    private void sendEmail(String emailId) {
        System.out.println("Sending email to " + emailId + "something");
    }
}
