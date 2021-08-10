package app.component;

import java.net.UnknownHostException;

public interface Greeting {
    String getCurrentIp() throws UnknownHostException;
}
