package Employe;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fullAnswer = false;

        while (!false) {
            System.out.println("****************************WELCOME****************************");
            System.out.println("Enter your name :");
            String name = sc.nextLine();
            System.out.println("Enter the surname :");
            String surname = sc.nextLine();
            System.out.println("Enter the salary :");
            int salary = sc.nextInt();
            System.out.println("Enter the workHours:");
            int workHours = sc.nextInt();
            System.out.println("Enter the hireYear :");
            int hireYear = sc.nextInt();
            System.out.println("********************************************************");
            Employee employee1 = new Employee(name, surname, salary, workHours, hireYear);
            System.out.println(employee1.toString());

        }

    }
}