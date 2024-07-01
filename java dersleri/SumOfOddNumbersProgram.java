import java.util.Scanner;

public class SumOfOddNumbersProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        int number;
        float total = 0;
        int counter = 0;

        while (!done) {
            System.out.println("Please enter a number :");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter the a valid value");
                sc.next();
            } else {
                number = sc.nextInt();
                if (number % 2 == 0) {

                    if (number % 4 == 0) {
                        System.out.println(number + "Number is added for total");
                        total += number;
                        counter += 1;

                    } else {
                        System.out.println(number + "Number is  not added for total");
                    }
                } else {
                    System.out.println(number + " is a odd ");
                    break;

                }
            }

        }
        System.out.println("Average" + (total / counter));

    }

}
