package org.example.State;

public class DeliveredState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Updating order status to delivered.");
    }
}
