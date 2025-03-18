import org.example.State.DeliveredState;
import org.example.State.OrderContext;

public class Test_StatePattern {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.processOrder(); // NewOrderState -> ProcessingState
        orderContext.processOrder(); // ProcessingState -> DeliveredState
        orderContext.processOrder(); // DeliveredState
    }
}
