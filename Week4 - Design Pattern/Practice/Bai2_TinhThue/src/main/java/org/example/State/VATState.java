package org.example.State;

public class VATState implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.1; // 10% VAT
    }
}
