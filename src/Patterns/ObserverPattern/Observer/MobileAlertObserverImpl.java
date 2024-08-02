package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String phoneNumber, StockObservable stockObservable) {
        this.userName = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName);
    }

    private void sendMsgOnMobile(String userName) {
        System.out.println("sending sms" + " " + userName);
    }
}
