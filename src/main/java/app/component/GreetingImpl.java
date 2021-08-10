package app.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(path = "/home")
public class GreetingImpl implements Greeting {

    @GetMapping("/ip")
    public String getCurrentIp() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
            return "Current IP address : " + ip.getHostAddress();
    }
}
