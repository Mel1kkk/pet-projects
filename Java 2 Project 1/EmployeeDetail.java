package Project2.Employee;

import javax.jws.soap.SOAPBinding;
import java.lang.*;
import java.util.*;
import java.io.*;

public abstract class EmployeeDetail {
    public static Scanner in = new Scanner(System.in);

    String name;
    int age;
    String email;
    String position;
    int ID;
    float salary;
    long contact;

    public void getInfo() {
        try {
            System.out.print("Enter Employee's name --------> ");
            this.name = in.nextLine();

            System.out.print("Enter Employee's age -> ");
            this.age = in.nextInt();
            in.nextLine();


            System.out.print("Enter Employee's ID ----------> ");
            this.ID = in.nextInt();
            in.nextLine();


            System.out.print("Enter Employee's Email ID ----> ");
            this.email = in.nextLine();


            System.out.print("Enter Employee's Position ----> ");
            this.position = in.nextLine();

            System.out.print("Enter Employee contact Info --> ");
            this.contact = in.nextLong();
            in.nextLine();


            System.out.print("Enter Employee's Salary ------> ");
            this.salary = in.nextFloat();
            in.nextLine();
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input. Try again from the start !");
            in.nextLine();
        }

    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }

    public float getSalary(){
        return salary;
    }
    public void setContact(long contact){
        this.contact = contact;
    }

    public long getContact(){
        return contact;
    }
}
