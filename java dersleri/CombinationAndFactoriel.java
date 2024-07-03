
/**
 * CombinationAndFactoriel
 */
import java.util.Scanner;

public class CombinationAndFactoriel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // C(n,r) = n! / (r! * (n-r)!)7
        int r, i, n;
        int total = 1;

        while (true) {

            System.out.println("Enter the n value :");
            if (!sc.hasNextInt()) {
                System.out.println("Enter the a valid value!!");
                sc.next();
                continue;
            } else {
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Enter the a valid value !!");
                    continue;
                } else {
                    System.out.println("N:" + n);
                }

            }
            System.out.println("Enter the r value :");
            if (!sc.hasNextInt()) {
                System.out.println("Enter the a valid value!!");
                sc.next();
                continue;
            } else {
                r = sc.nextInt();
                if (r < 0) {
                    System.out.println("Enter the a valid value !!");
                    continue;
                } else {
                    System.out.println("R:" + r);
                }

            }

            // Kombinasyon hesaplama
            int result = combination(n, r);
            System.out.println("C(" + n + "," + r + ") = " + result);

        }

    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}
