import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        double pi = 3.14;

        System.out.println("Enter the r value :");

        r = sc.nextInt();

        double Perimeter = 2 * r * pi;
        double Area = 2 * pi * r * r;

        System.out.printf("AREA : %s  \nPERIMETER : %s%n", Area, Perimeter);

    }
}
