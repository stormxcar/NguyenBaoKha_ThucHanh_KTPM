package org.example.Strategy;

import org.example.State.TaxState;

public class VATStrategy implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.1; // 10% VAT
    }
}
