import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class Person {

    @Inject
    private Greeting greeting;

    public Person() {
    }

    public void sayHi(String name) {
        System.out.println(greeting.getGreeting(name));
    }
}
