package org.example.Decorator;

import org.example.Strategy.TaxStrategy;

public abstract class TaxDecorator implements TaxStrategy {
    protected TaxStrategy decoratedTax;

    public TaxDecorator(TaxStrategy decoratedTax) {
        this.decoratedTax = decoratedTax;
    }

    public double calculate(double price) {
        return decoratedTax.calculate(price);
    }
}
