package Project3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPPacketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("10.48.138.27", 1024);
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            int count = 1;
            while (true) {
                System.out.print("Enter the data packet: ");
                String word = buffReader.readLine();
                Packet packet = new Packet(count, word);

                output.write(packet.getSerialNo() + "\n");
                output.flush();

                output.write(packet.getData() + "\n");
                output.flush();

                if (word.toUpperCase().equals("CLOSE")) {
                    System.out.println("\nClient disconnected");
                    break;
                }

                String fromServer = input.readLine();
                System.out.println("FROM SERVER: " + fromServer);

                count++;

            }
        }
        catch(Exception e){
            System.out.println("Failed to connect to the server");

        }
    }
}


