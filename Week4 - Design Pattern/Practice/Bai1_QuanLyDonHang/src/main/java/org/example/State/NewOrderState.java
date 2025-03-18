package org.example.State;

public class NewOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Checking order information.");
        context.setState(new ProcessingState());
    }
}
