package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);

    public void delete(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int stockCount);

    public void emptyStock();

    public int getStockCount();
}
