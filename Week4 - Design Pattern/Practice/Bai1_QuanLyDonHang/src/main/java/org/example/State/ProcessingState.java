package org.example.State;

public class ProcessingState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Packing and shipping the order.");
        context.setState(new DeliveredState());
    }
}
