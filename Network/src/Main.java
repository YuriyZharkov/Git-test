

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Main {
    public static void main(String[] args) {
        final String hostname = "80rush.adr.com.ua";
        try {
            InetAddress ipaddress = InetAddress.getByName(hostname);
            System.out.println(ipaddress.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
