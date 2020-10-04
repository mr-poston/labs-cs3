import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

/*
 * Note: This class will not compile until you have completed the following classes:
 * Automobile (abstract, implements Vehicle)
 * Aircraft (abstract, implements Vehicle)
 * Car (extends Automobile)
 * Truck (extends Automoblile)
 * Airplane (extends Aircraft)
 * Helicopter (extends Aircraft & implements Leasable)
 */

public class VehicleRunner {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();

        list.add(new Car("Honda Civic", 2009, 9000, 32));
        list.add(new Truck("Chevy Silverado", 2015, 17000, 2500));
        list add(new Airplane("Cessna 206", 1997, 400000, 6, true));

        Helicopter helicopter = new Helicopter("Bell 206L", 1986, 660000, 7, false);

        list.add(helicopter);

        for (Vehicle v : list) {
            out.println(v.getInfo() + "\n");
        }

        out.println("Helicopter monthly payment >>> $" + helicopter.getMonthlyPayment());
}
