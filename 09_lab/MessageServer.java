import java.net.*;
import java.io.*;

public class MessageServer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MessageServer <file path>");
            return;
        }

        String filePath = args[0];
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket clientSocket = serverSocket.accept();
            OutputStream out = clientSocket.getOutputStream();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                out.write((line + "\n").getBytes());
                Thread.sleep(500);
            }
            out.close();
            reader.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
