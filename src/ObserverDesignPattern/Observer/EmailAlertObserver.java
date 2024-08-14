package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailID;
    StocksObservable stocksObservable;
    String product;
    public EmailAlertObserver(String emailID, StocksObservable stocksObservable, String product){
        this.emailID = emailID;
        this.stocksObservable = stocksObservable;
        this.product = product;
    }

    @Override
    public void update() {
       sendEmail();
    }

    public void sendEmail(){
        System.out.println("Mail sent to "+this.emailID+" for "+this.product);
    }
}
