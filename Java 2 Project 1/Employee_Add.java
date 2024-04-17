package Project2.Employee;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Employee_Add extends EmployeeDetail {
    Scanner in = new Scanner(System.in);


    public void createFile() throws IOException{
        String fileName = "file" + super.ID + ".txt";
        File file = new File(fileName);
        try {
            if (file.exists()) {
                System.out.println("\nEmployee already exists");
                System.out.println("\nPress Enter to Continue...");
                in.nextLine();
            } else {
                PrintWriter writer = new PrintWriter(fileName);
                writer.println("Employee ID: " + this.ID);
                writer.println("Employee Name: " + this.name);
                writer.println("Employee Age: " + this.age);
                writer.println("Employee Contact: " + this.contact);
                writer.println("Email Information: " + this.email);
                writer.println("Employee position: " + this.position);
                writer.println("Employee Salary: " + this.salary);

                writer.close();

            }
        }
        catch (Exception e){
            System.out.println("Can not find this file");
        }







    }
}









