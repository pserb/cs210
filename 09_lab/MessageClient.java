import java.net.*;
import java.io.*;

public class MessageClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java MessageClient <ip address> <port number>");
            return;
        }
        String ip = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            Socket socket = new Socket(ip, port);
            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
