import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean value = false;
        int number;
        int i;

        while (!value) {
            int total = 0;
            System.out.println("Enter the number :");
            if (!input.hasNextInt()) {
                System.out.println("Please enter the a valid bit.");
                input.next();
            } else {
                number = input.nextInt();

                for (i = 1; i < number; i++) {
                    if (number % i == 0) {
                        total += i;
                        System.out.println(i + " divided " + number);
                    }

                }
                System.out.println("Total :" + total);

                if (total == number) {
                    System.out.println(number + " is perfect number .");
                } else {
                    System.out.println(number + "is not perfect number .");
                }
            }

        }

    }

}
