/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
       if (args[0].equals("car")) {
           Vehicle car = new Car("Honda Civic", 2009, 9000.0, 32.0);
           out.println(car);
       }
       if (args[0].equals("truck")) {
           Vehicle truck = new Truck("Chevy Siverado", 2014, 18000.0, 5000);
           out.println(truck);
       }
       if (args[0].equals("airplane")) {
           Vehicle plane = new Airplane("Cessna 206", 1997, 440000.0, 6, true);
           out.println(plane);
       }
       if (args[0].equals("helicopter")) {
           Vehicle heli = new Helicopter("Bell 206L", 1986, 660000.0, 7, false);
           out.println(heli);
       }
    }
}
