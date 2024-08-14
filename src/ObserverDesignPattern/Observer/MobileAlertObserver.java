package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String mobile;
    StocksObservable stocksObservable;
    String product;
    public MobileAlertObserver(String mobile, StocksObservable stocksObservable, String product){
        this.mobile = mobile;
        this.stocksObservable = stocksObservable;
        this.product = product;
    }

    @Override
    public void update() {
        sendSMS();
    }

    public void sendSMS(){
        System.out.println("SMS sent to "+this.mobile+" for "+this.product);
    }
}
