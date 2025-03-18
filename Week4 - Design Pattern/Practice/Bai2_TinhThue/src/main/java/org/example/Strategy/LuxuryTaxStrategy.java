package org.example.Strategy;

import org.example.State.TaxState;

public class LuxuryTaxStrategy implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.2; // 20% Luxury Tax
    }
}
