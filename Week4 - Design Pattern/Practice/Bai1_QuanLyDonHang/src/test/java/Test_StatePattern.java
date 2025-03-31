import org.example.State.CancelledState;
import org.example.State.DeliveredState;
import org.example.State.OrderContext;

public class Test_StatePattern {
    public static void main(String[] args) {
        OrderContext orderContext1 = new OrderContext();

        System.out.println("New - processing - deliveried Order State case:");
        orderContext1.processOrder(); // NewOrderState -> ProcessingState
        orderContext1.processOrder(); // ProcessingState -> DeliveredState
        orderContext1.processOrder(); // DeliveredState


        OrderContext orderContext2 = new OrderContext();
        System.out.println("\nCancel order case");
        orderContext2.setState(new CancelledState());
        orderContext2.processOrder(); // CancelledState

        OrderContext orderContext3 = new OrderContext();
        System.out.println("\nProcessing - cancel order case");
        orderContext3.processOrder(); // NewOrderState -> ProcessingState
        orderContext3.setState(new CancelledState());
        orderContext3.processOrder(); // CancelledState

    }
}
