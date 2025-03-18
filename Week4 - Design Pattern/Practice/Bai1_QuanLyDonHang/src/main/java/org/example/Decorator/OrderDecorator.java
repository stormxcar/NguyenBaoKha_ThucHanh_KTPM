package org.example.Decorator;

import org.example.Decorator.Order;

public abstract class OrderDecorator extends Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order decoratedOrder) {
        this.decoratedOrder = decoratedOrder;
    }

    public void process() {
        decoratedOrder.process();
    }
}
