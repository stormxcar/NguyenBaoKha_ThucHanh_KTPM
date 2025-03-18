package org.example.Strategy;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}
