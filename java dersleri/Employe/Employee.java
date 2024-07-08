package Employe;

import java.util.Scanner;

public class Employee {
    String name;
    String surname;
    int salary;
    int workHours;
    int hireYear;
    int bonusHours;
    int firstSalary;

    public Employee(String name, String surname, int salary, int workHours, int hireYear) {

        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonusHours = 0;
        this.firstSalary = salary; // İlk maaşı başlangıçta saklayın
        tax();
        bonus();
        raiseSalary();

    }

    public void tax() {
        if (this.salary < 1000) {
            System.out.println("tax will not be applied");
            this.salary = salary;
        } else {
            System.out.println("tax will be applied.");
            this.salary -= this.salary * 0.03;

        }
    }

    public void bonus() {
        if (this.workHours > 40) {
            this.bonusHours = this.workHours - 40;
            System.out.println("You worked bonus total time :" + bonusHours);

            this.salary += (bonusHours * 30);
            System.out.println("New salary :" + this.salary);
        } else {
            System.out.println("You don't have bonus time !!!");
            this.salary = salary;
        }
    }

    public void raiseSalary() {// kullanıcıdan yıl bilgisi alcaz oan göre hesap yapcaz
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year = sc.nextInt();

        int yearsWorked = year - this.hireYear;

        if (yearsWorked < 10) {
            System.out.println("You won the bonus 5%");
            this.salary += this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            System.out.println("You won the bonus 10%");
            this.salary += this.salary * 0.10;
        } else if (yearsWorked >= 20) {
            System.out.println("You won the bonus 15%");
            this.salary += this.salary * 0.15;
        } else {
            System.out.println("Please enter a valid hireYear!!!");
        }
    }

    @Override
    public String toString() {
        return "**************************************" + "\n" +

                "Employee{\n" +
                "NAME: '" + this.name + "'\n" +
                "SURNAME: '" + this.surname + "'\n" +
                "WORKHOURS: " + this.workHours + "\n" +
                "FIRST SALARY :" + this.firstSalary + "\n" +
                "HIREYEAR: " + this.hireYear + "\n" +
                "BONUS TİME:" + this.bonusHours + "\n" +
                "TOTAL SALARY: " + this.salary + "\n" +
                "**************************************" + "\n" +
                '}';
    }
}
