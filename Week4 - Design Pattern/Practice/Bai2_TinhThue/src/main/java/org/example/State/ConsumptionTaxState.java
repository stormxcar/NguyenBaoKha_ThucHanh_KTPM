package org.example.State;

public class ConsumptionTaxState implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.05; // 5% VAT
    }
}
