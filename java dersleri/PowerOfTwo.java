import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter the number :");
        num = sc.nextInt();

        for (int i = 0, j = 0; (i < num && j < num);) {
            System.out.println("i: " + i + ", j: " + j);
            i *= 4;
            j *= 5;
            
        }

        sc.close();
    }
}
