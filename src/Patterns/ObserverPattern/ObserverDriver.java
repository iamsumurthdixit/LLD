package Patterns.ObserverPattern;

import Patterns.ObserverPattern.Observable.IphoneObservableImpl;
import Patterns.ObserverPattern.Observable.StockObservable;
import Patterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import Patterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

public class ObserverDriver {
    public static void driver() {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("user1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("user2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user3_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(-10);

        iphoneStockObservable.remove(observer2);
        iphoneStockObservable.setStockCount(10);
    }
}
