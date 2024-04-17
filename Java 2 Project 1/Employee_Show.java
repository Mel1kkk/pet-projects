package Project2.Employee;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Employee_Show {
    public void viewFile(String ID) throws IOException{
        try {
            File file = new File("file" + ID + ".txt");

            Scanner in = new Scanner(file);

            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
        }
   catch (IOException e){
            System.out.println("Can not open this file");
   }


    }
}
