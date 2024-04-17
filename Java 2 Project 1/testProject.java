package Project2.Employee;

import java.util.*;
import java.lang.*;
import java.io.*;
public class testProject {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Employee_Show epShow = new Employee_Show();
        Employee_Add ep = new Employee_Add();
        Employee_Update epUpdate = new Employee_Update();
        mainMenu obj1 = new mainMenu();

        while (true) {
            obj1.mainMenu();
            System.out.print("\nPlease enter choice: ");
            int choice = in.nextInt();
            switch (choice) {

                case 1:
                    ep.getInfo();
                    ep.createFile();
                    break;

                case 2:
                    System.out.print("\nPlease Enter Employee's ID :");
                    int ID = in.nextInt();
                    try {
                        epShow.viewFile(String.valueOf(ID));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;


                case 3:
                    System.out.print("\nPlease Enter Employee's ID :");
                    int id = in.nextInt();
                    Employee_Remove epRemove = new Employee_Remove();
                    epRemove.removeFile(id);
                    break;

                case 4:
                    System.out.println("");
                    System.out.print("Please Enter Employee's ID :");
                    in.nextLine();
                    String I = in.nextLine();
                    Employee_Show show = new Employee_Show();
                    try {
                        show.viewFile(I);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.println("Please Enter the detail you want to Update :");
                    String s = in.nextLine();
                    System.out.println("Please Enter the Updated Info :");
                    String n = in.nextLine();
                    try {
                        epUpdate.updateFile(I, s, n);
                        obj1.mainMenu();

                    } catch (IOException e) {
                        System.out.println("Can not open this file");
                    }
                    break;


                case 5:
                    codeExit exit = new codeExit();
                    exit.codeExit();
                    break;
            }
        }
    }
}

