package org.example.Decorator;

import org.example.Decorator.OrderDecorator;

public class NotificationOrderDecorator extends OrderDecorator {
    public NotificationOrderDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Sending notification for order processing.");
    }
}
