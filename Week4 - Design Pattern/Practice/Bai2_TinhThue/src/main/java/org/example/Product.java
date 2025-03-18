package org.example;

import org.example.Strategy.TaxStrategy;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        return taxStrategy.calculate(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
