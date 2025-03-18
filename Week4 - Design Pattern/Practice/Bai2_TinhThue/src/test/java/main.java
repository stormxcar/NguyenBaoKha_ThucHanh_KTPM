import org.example.Decorator.AdditionalTaxDecorator;
import org.example.Product;
import org.example.Strategy.ConsumptionTaxStrategy;
import org.example.Strategy.LuxuryTaxStrategy;
import org.example.Strategy.VATStrategy;

public class main {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 100.0, new VATStrategy());
        Product product2 = new Product("Product 2", 200.0, new ConsumptionTaxStrategy());
        Product product3 = new Product("Product 3", 300.0, new LuxuryTaxStrategy());

        System.out.println(product1.getName() + " Tax: " + product1.calculateTax());
        System.out.println(product2.getName() + " Tax: " + product2.calculateTax());
        System.out.println(product3.getName() + " Tax: " + product3.calculateTax());

        // Using Decorator to add additional tax
        Product product4 = new Product("Product 4", 400.0, new AdditionalTaxDecorator(new VATStrategy()));
        System.out.println(product4.getName() + " Tax with additional tax: " + product4.calculateTax());
    }
}
