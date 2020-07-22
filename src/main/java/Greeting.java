import org.jvnet.hk2.annotations.Service;

import java.text.MessageFormat;

@Service
public class Greeting {

    public String getGreeting(String name) {
        return MessageFormat.format("Hello, {0}", name);
    }
}
