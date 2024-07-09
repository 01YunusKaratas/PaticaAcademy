import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = { 56, 34, 1, 8, 101, -2, -33 };
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int min = Integer.MIN_VALUE; // to tour the array
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < num) {
                min = list[i];

            } else if (list[i] >= num) {
                max = list[i];
                break;
            }

        }
        System.out.println("Number Değer " + num);
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }

}
