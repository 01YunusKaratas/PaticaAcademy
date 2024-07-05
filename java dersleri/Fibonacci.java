import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for Fibonacci series:");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int[] arry = new int[num];

        // İlk iki elemanı manuel olarak ayarla
        if (num > 0) {
            arry[0] = 0;
        }
        if (num > 1) {
            arry[1] = 1;
        }

        // Fibonacci serisini hesapla
        for (int i = 2; i < num; i++) {
            arry[i] = arry[i - 1] + arry[i - 2];
        }

        // Fibonacci serisini ekrana yazdır
        System.out.println("Fibonacci series:");
        for (int i = 0; i < num; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
