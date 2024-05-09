package pl.tima;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;

public class SSLConection {

    public static String hashPasswordMD5(String password) {
        String hashedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            System.out.println(md);

            // Get the hash's bytes
            byte[] bytes = md.digest();
            System.out.println(bytes);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1)));
            }
            // Get complete hashed password in hexadecimal format
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println( e.getMessage());
        }
        return hashedPassword;
    }


    public static void main(String[] args) {
        String passwordToHash = "12345";
        String hashedPassword = hashPasswordMD5(passwordToHash);
        System.out.println("Hashed Password: " + hashedPassword);

        String host = "dslocate.datasystem.pl";
        int port = 8084;

        String loginMsg = "<login opid=\"1\" user=\"goeuropa\" password=\""+ hashedPassword +
                "\" protocol=\"1\"/>";
        System.out.println(loginMsg);
        try {
            // Obtain IP address from domain
            InetAddress address = InetAddress.getByName(host);


            // Get socket descriptor
            Socket socket = new Socket(address, port);

            // Initialize SSL context
            SSLContext sslContext = SSLContext.getInstance("TLSv1.1");
            sslContext.init(null, null, null);

            // Create SSL socket
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket(socket, host, port, true);
            System.setProperty("javax.net.debug", "ssl");

            // Establish SSL connection
            sslSocket.startHandshake();
            System.out.println("Encrypted connection successful: " + sslSocket.getSession().getCipherSuite());

            // Send login message
            sslSocket.getOutputStream().write(loginMsg.getBytes());
            System.out.println("DS LOCATE - Login successful");

            // Receive frames
            byte[] buffer = new byte[2048];
            int bytesRead;
            while ((bytesRead = sslSocket.getInputStream().read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException | NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }
}

