package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
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
