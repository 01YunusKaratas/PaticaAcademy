import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        System.out.println("Please enter the number :");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print((1.0 / i) + "\t");
            total += (1.0 / i); // 1.0 yazmazsak hata verir

        }
        System.out.println(" ");
        System.out.println("Harmonic result :" + total);
    }
}
