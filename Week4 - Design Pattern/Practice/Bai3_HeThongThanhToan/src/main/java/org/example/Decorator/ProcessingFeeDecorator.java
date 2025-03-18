package org.example.Decorator;

import org.example.Strategy.PaymentStrategy;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentStrategy decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double fee = 5.0; // Example processing fee
        super.pay(amount + fee);
        System.out.println("Processing fee of " + fee + " added.");
    }
}
