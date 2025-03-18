package org.example.Decorator;

import org.example.Strategy.PaymentStrategy;

public class DiscountDecorator extends PaymentDecorator{
    public DiscountDecorator(PaymentStrategy decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double discount = 10.0; // Example discount
        super.pay(amount - discount);
        System.out.println("Discount of " + discount + " applied.");
    }
}
