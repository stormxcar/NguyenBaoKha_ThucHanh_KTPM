import org.example.Decorator.LoggingOrderDecorator;
import org.example.Decorator.NotificationOrderDecorator;
import org.example.Decorator.Order;

public class Test_DecoratorPattern {
    public static void main(String[] args) {
        Order order = new Order();
        Order loggingOrder = new LoggingOrderDecorator(order);
        Order notificationOrder = new NotificationOrderDecorator(order);
        Order loggingAndNotificationOrder = new LoggingOrderDecorator(new NotificationOrderDecorator(order));

        System.out.println("Basic Order:");
        order.process();

        System.out.println("\nLogging Order:");
        loggingOrder.process();

        System.out.println("\nNotification Order:");
        notificationOrder.process();

        System.out.println("\nLogging and Notification Order:");
        loggingAndNotificationOrder.process();
    }
}
