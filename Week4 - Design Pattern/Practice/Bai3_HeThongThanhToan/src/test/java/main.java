import org.example.Decorator.DiscountDecorator;
import org.example.Decorator.ProcessingFeeDecorator;
import org.example.State.CompletedState;
import org.example.State.FailedState;
import org.example.State.PaymentState;
import org.example.State.ProcessingState;
import org.example.Strategy.CreditCardPayment;
import org.example.Strategy.PayPalPayment;
import org.example.Strategy.PaymentStrategy;

public class main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy payPalPayment = new PayPalPayment();

        PaymentStrategy creditCardWithFee = new ProcessingFeeDecorator(creditCardPayment);
        PaymentStrategy payPalWithDiscount = new DiscountDecorator(payPalPayment);

        System.out.println("Credit Card Payment with Processing Fee:");
        creditCardWithFee.pay(100.0);

        System.out.println("\nPayPal Payment with Discount:");
        payPalWithDiscount.pay(100.0);

        PaymentState processingState = new ProcessingState();
        PaymentState completedState = new CompletedState();
        PaymentState failedState = new FailedState();

        System.out.println("\nPayment States:");
        processingState.handlePayment();
        completedState.handlePayment();
        failedState.handlePayment();
    }
}
