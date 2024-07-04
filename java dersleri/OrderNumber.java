import java.util.Scanner;
import java.util.Arrays;

public class OrderNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?");
        int num = input.nextInt();
        System.out.println("Created array for " + num + " values");

        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number:");
            int value = input.nextInt();
            numbers[i] = value; // Değeri doğrudan atama
            System.out.println((i + 1) + " value added to the array :" + value);
        }

        // En büyük ve en küçük değeri bulma
        int max = Arrays.stream(numbers).max().getAsInt(); // JAVA 8 kullanarak max değeri bulma
        int min = Arrays.stream(numbers).min().getAsInt(); // JAVA 8 kullanarak min değeri bulma

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

        // Scanner kaynağını kapatma
        input.close();
    }
}
