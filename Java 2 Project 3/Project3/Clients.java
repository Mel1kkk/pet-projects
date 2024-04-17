package Project3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Clients {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("10.48.138.27", 1234);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            while (true) {
                String serverWords = buff.readLine();
                System.out.println("Server: " + serverWords);
                System.out.print("Client: ");
                String input = bufferedReader.readLine();
                while(input.replace(" ", "").isEmpty()){
                    System.out.print("Client: ");
                    input = bufferedReader.readLine();
                }

                ps.println(input);
                ps.flush();

            }
        }
        catch(Exception e){
            System.out.println("Failed to connect to the server");
        }
    }
}
