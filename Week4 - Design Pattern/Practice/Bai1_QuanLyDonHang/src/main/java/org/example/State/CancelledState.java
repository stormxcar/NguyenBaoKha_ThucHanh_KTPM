package org.example.State;

public class CancelledState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Cancelling order and processing refund.");
    }
}
