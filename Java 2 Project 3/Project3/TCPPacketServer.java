package Project3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPPacketServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1024);
            Socket client = serverSocket.accept();

            System.out.print("Opening port");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1200);
                    System.out.print(".");
                } catch (Exception ex) {
                    System.out.println("Unexpected error");
                }
            }
            System.out.println("\n");

            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            while (true) {
                String SerialNo = input.readLine();
                System.out.println("Recieving From Clients Packet's serialNo#" + SerialNo);
                String Data = input.readLine();
                if (Data.toUpperCase().equals("CLOSE")) {
                    System.out.println("\nServer has been closed");
                    break;
                }

                if (Data.replace(" ", "").isEmpty()) {
                    System.out.println("and packet's Data is empty");
                } else {
                    System.out.println("and packet's Data is " + Data.toUpperCase());
                }

                output.write("Packer SerialNo#" + SerialNo + " is received" + "\n");
                output.flush();
            }
        }
        catch(Exception exception){
            System.out.println("Server has some issues to deal with");

        }
    }
}
