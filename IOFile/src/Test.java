import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {

        System.out.println(getHostIpAddressOrHostName());

    }

    private static String getHostIpAddressOrHostName() {
        try {
            // Get the local host
            InetAddress localHost = InetAddress.getLocalHost();

            // Return either the host name or the host IP address
            return localHost.getHostName(); // or localHost.getHostAddress();
        } catch (UnknownHostException e) {
            // Handle the exception (e.g., log it) - return a default value if needed
            e.printStackTrace();
            return "DefaultHost";
        }
    }
}
