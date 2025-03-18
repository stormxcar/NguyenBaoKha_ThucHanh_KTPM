import org.example.BasicCar;
import org.example.Car;
import org.example.LuxuryCar;
import org.example.SportsCar;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
