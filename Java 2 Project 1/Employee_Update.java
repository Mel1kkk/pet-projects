package Project2.Employee;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Employee_Update{
    public void updateFile(String s, String o, String n) throws IOException{
        String fileName = "file" + s + ".txt";
        File file = new File(fileName);
        Scanner in = new Scanner(file);
        String fileContext = "";
        while(in.hasNextLine()){
            fileContext = fileContext + in.nextLine() + "\n";
        }
        PrintWriter writer = new PrintWriter(fileName);
        fileContext = fileContext.replaceAll(o, n);
        writer.write(fileContext);
        writer.close();







    }

}
