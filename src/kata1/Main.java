package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Kiliam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Pepito Perez", LocalDate.of(1967, Month.FEBRUARY, 18));
        System.out.println(person.toString());
    }
    
}
