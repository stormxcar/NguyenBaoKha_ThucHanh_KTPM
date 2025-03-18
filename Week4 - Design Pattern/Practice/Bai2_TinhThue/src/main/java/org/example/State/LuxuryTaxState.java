package org.example.State;

public class LuxuryTaxState implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.2; // 20% Luxury Tax
    }
}
