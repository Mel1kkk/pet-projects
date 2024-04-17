package Project2.Employee;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Employee_Remove implements Remove{

    @Override
    public void removeFile(int ID) {
        String fileName = "file" + ID + ".txt";
        File file = new File(fileName);
        if( file.delete()){
            System.out.println("\n Employee has been removed successfully");
        }
        else{
            System.out.println("\n Employee doesn't exists");
        }
    }
}
