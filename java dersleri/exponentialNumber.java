import java.util.Scanner;
import java.math.*;

public class exponentialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float number, exponent;
        boolean exponential = false;

        while (!exponential) {
            System.out.println("Do you want to start calculating an exponential number ('e')or type ('q' )to EXIT");
            if (input.hasNext("q")) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else if (input.hasNext("e")) {
                input.next();
                System.out.println("Enter the number:");
                if (!input.hasNextFloat()) {
                    System.out.println("Enter a valid number!!!");
                    input.next(); // geçersiz girişi temizle
                    continue;
                } else {
                    number = input.nextFloat();
                    System.out.println("Number :" + number);
                }

                System.out.println("Enter the exponent:");
                if (!input.hasNextFloat()) {
                    System.out.println("Enter a valid number!!!");
                    input.next(); // geçersiz girişi temizle
                    continue;
                } else {
                    exponent = input.nextFloat();
                }

                float result = (float) Math.pow(number, exponent);
                System.out.println("Exponential result: " + result);

            } else {
                System.out.println("Enter the a valid value ,TRY AGAIN for system.");
                break;
            }

        }

        input.close();
    }
}
