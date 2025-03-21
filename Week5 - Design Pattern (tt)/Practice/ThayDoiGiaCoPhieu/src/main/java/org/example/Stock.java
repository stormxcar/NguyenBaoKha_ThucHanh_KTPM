package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stock implements ISubject {
    private String stockName;
    private double price;
    private List<IObserver> observers = new ArrayList<>();

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update("Cổ phiếu " + stockName + " đã thay đổi giá thành: " + price);
        }
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers();
        }
    }
}
