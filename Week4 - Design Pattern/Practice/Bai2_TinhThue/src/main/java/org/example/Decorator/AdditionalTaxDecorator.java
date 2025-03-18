package org.example.Decorator;

import org.example.Strategy.TaxStrategy;

public class AdditionalTaxDecorator extends TaxDecorator{
    public AdditionalTaxDecorator(TaxStrategy decoratedTax) {
        super(decoratedTax);
    }

    @Override
    public double calculate(double price) {
        return super.calculate(price) + price * 0.03; // Additional 3% tax
    }
}
