package org.example.Decorator;

import org.example.Decorator.OrderDecorator;

public class LoggingOrderDecorator extends OrderDecorator {
    public LoggingOrderDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Logging order processing.");
    }
}
