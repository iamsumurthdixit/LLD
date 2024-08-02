package Patterns.ObserverPattern.Observable;

import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();
}
