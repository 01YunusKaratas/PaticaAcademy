import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num;
        int computer = rand.nextInt(100);
        // System.out.println(computer);

        int count = 0;
        int right = 10;
        int[] arry = new int[right];
        System.out.println("Enter the number  or 'q'-EXIT");
        while (count < 10) {

            if (sc.hasNext("q")) {
                System.out.println("Exiting the system");
                System.out.println("Have a nice day.");
                System.exit(0);
                break;

            } else if (!sc.hasNextInt()) {
                System.out.println("Please enter the valid value !!!");
                sc.next(); // cleaning
                continue;
            } else {
                System.out.print("Guessing Number :");
                num = sc.nextInt(); // player guessing
                arry[count] = num; // Tahmini diziye kaydet
                count++; // wrong answer total
                if (num < computer) {
                    System.out.println("Wrong Answer ,go to UP guess");
                    System.out.println("remaining right:" + (right - count));
                    continue;
                } else if (num > computer) {
                    System.out.println("Wrong Answer ,go to DOWN guess");
                    System.out.println("remaining right:" + (right - count));
                    continue;
                } else if (num == computer) {
                    System.out.println("Correct Answer,Congratulations");
                    break;

                }

            }

        }

        System.out.println("*******YOUR ANSWER*******");

        for (int i = 0; i < count; i++) {

            System.out.print("[" + arry[i] + "]" + " "); // correct answer always finally array value

        }
        System.out.println("");
    }

}
