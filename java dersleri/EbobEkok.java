import java.security.interfaces.ECKey;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2;
        int ebob = 1;
        int ekok = 1;
        while (true) {

            boolean numbers = false;

            while (!numbers) {
                System.out.println("Enter the number 1 for  ebob or ekok :?");
                number1 = sc.nextInt();

                System.out.println("Enter the number 2  for  ebob or ekok :?");
                number2 = sc.nextInt();

                for (int i = 1; i <= number1; i++) {
                    if (number1 % i == 0 && number2 % i == 0) {
                        ebob = i;

                    }
                }

                for (int j = 1; j <= (number1 * number2); j++) {
                    if (number1 % j == 0 && number2 % j == 0) {
                        ekok = j;

                    }
                }

                System.out.println("******************RESULT******************");
                System.out.println("Ebob :" + ebob);
                System.out.println("Ekok:" + (number1 * number2) / ebob);

            }
        }

    }
}
