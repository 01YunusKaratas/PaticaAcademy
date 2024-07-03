import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean digits = false;
        int number;
        int i = 0;
        int sum = 0;

        while (!digits) {
            System.out.println("Do you want to start calculating an exponential number ('e')or type ('q' )to EXIT");
            if (input.hasNext("q")) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else if (input.hasNext("e")) {
                input.next();
                System.out.println("Enter the number:");
                if (!input.hasNextInt()) {
                    System.out.println("Enter a valid number!!!");
                    input.next(); // geçersiz girişi temizle
                    continue;
                }

                number = input.nextInt();
                while (number != 0) {
                    sum += number % 10;
                    number /= 10;

                }
                System.out.println("Sum of digits of " + number + " is: " + sum);

            } else {
                System.out.println("Enter the a valid value ,TRY AGAIN for system.");
                break;
            }

        }

    }

}
