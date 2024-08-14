package ObserverDesignPattern;

import ObserverDesignPattern.Observable.AndroidObservable;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observable.iPhoneObservable;
import ObserverDesignPattern.Observer.EmailAlertObserver;
import ObserverDesignPattern.Observer.MobileAlertObserver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Store {

    public static void main(String[] args) {
        StocksObservable iPhoneStocksObservable = new iPhoneObservable();
        StocksObservable AndroidPhoneStocksObservable = new AndroidObservable();
        Store.populateData(iPhoneStocksObservable, AndroidPhoneStocksObservable);

        // Actions
        iPhoneStocksObservable.emptyStock();
        iPhoneStocksObservable.setStockCount(10);
        AndroidPhoneStocksObservable.setStockCount(20);
    }

    // Populating observers from csv file
    private static void populateData( StocksObservable iPhoneStocksObservable,
                                      StocksObservable AndroidPhoneStocksObservable ){
        String csvFile = "src/ObserverDesignPattern/data.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String observerType = data[0];
                if (observerType.compareTo("email") == 0) {
                    String email = data[1];
                    String observableType = data[2];
                    if (observableType.compareTo("iPhoneStocksObservable") == 0){
                        iPhoneStocksObservable.add(new EmailAlertObserver(email,
                                iPhoneStocksObservable,"iPhone"));

                    } else if (observableType.compareTo("AndroidPhoneStocksObservable") == 0) {
                        AndroidPhoneStocksObservable.add(new EmailAlertObserver(email,
                                AndroidPhoneStocksObservable,"Android"));
                    }
                } else if (observerType.compareTo("phone") == 0) {
                    String phone = data[1];
                    String observableType = data[2];
                    if (observableType.compareTo("iPhoneStocksObservable") == 0){
                        iPhoneStocksObservable.add(new MobileAlertObserver(phone,
                                iPhoneStocksObservable,"iPhone"));
                    } else if (observableType.compareTo("AndroidPhoneStocksObservable") == 0) {
                        AndroidPhoneStocksObservable.add(new MobileAlertObserver(phone,
                                AndroidPhoneStocksObservable, "Android"));
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
