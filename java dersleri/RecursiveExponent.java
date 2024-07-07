import java.util.Scanner;

public class RecursiveExponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Starting Program-'s' or (q-EXIT)");

            if (scan.hasNext("q")) {
                System.out.println("Exiting Program");
                System.exit(0);

            } else {
                scan.next();
                System.out.println("Enter the number :");
                int num = scan.nextInt();
                System.out.println("Enter the exponent :");
                int exponent = scan.nextInt();

                System.out.println("Result : " + exponentRecursive(num, exponent));
            }

        }

    }

    public static int exponentRecursive(int num, int exponent) {

        if (exponent == 1) {
            return num;
        } else if (exponent == 0) {
            return 1;
        } else {
            return num * (exponentRecursive(num, (exponent - 1)));
        }

    }
}
