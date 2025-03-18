import org.example.Strategy.CreditCardPayment;
import org.example.Strategy.PayPalPayment;
import org.example.Strategy.PaymentStrategy;

public class Test_StrategyPattern {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy payPalPayment = new PayPalPayment();
        creditCardPayment.pay(100.0);
        payPalPayment.pay(200.0);
    }
}
