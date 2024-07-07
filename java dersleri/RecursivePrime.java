import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number :");
            int num = sc.nextInt();

            System.out.println(isPrime(num));

        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) { // sayı birden küçükmü ?
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // tam bölünüyorsa olmaz prime number
            }
        }
        return true; // prime number olanları döndürür.
    }
}
