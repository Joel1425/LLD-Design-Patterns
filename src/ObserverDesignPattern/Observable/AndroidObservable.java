package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

// Customers who are willing to buy Android devices
public class AndroidObservable implements StocksObservable{
    public List<NotificationAlertObserver> observers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void delete(NotificationAlertObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : this.observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if (this.stockCount == 0){
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public void emptyStock() {
        this.stockCount = 0;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}

