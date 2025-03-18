package org.example.State;

public class FailedState implements PaymentState{
    @Override
    public void handlePayment() {
        System.out.println("Payment failed.");
    }
}
