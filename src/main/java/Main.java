import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

public class Main {

    public static void main(String[] args) {
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
        Person p = locator.getService(Person.class);
        p.sayHi("Dave");
    }
}
