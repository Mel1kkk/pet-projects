package Project3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MTServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.print("Waiting for client request");

            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1100);
                    System.out.print(".");
                } catch (Exception ex) {
                    System.out.println("Unexpected error");
                }
            }

            System.out.println();

            Socket client = serverSocket.accept();
            System.out.println("New client is pop up!");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader buff = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream ps = new PrintStream(client.getOutputStream());

            while (true) {
                System.out.print("Server: ");
                String input = bufferedReader.readLine();
                while(input.replace(" ", "").isEmpty()){
                    System.out.print("Server: ");
                    input = bufferedReader.readLine();
                }
                ps.println(input);
                ps.flush();

                String clientWords = buff.readLine();
                System.out.println("Clients: " + clientWords);

            }
        }
        catch(Exception ex){
            System.out.println("Server has some issues to deal with");
        }
    }
}
