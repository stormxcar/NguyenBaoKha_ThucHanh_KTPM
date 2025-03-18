package org.example.State;

public class CompletedState implements PaymentState{
    @Override
    public void handlePayment() {
        System.out.println("Payment completed successfully.");
    }
}
