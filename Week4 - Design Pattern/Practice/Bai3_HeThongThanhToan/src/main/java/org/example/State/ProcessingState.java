package org.example.State;

public class ProcessingState implements PaymentState{
    @Override
    public void handlePayment() {
        System.out.println("Payment is processing...");
    }
}
