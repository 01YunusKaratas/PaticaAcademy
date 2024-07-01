import java.util.Scanner;
import java.util.Arrays;

public class BigMediumSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int value;

        System.out.println("how much will you add  number ? ");

        value = sc.nextInt();

        int[] arry = new int[value];

        for (; i < value; i++) {
            System.out.print("Enter number " + (i + 1) + " :");
            int number = sc.nextInt();

            arry[i] += number; // added number in array

        }
        System.out.println(" ");

        Arrays.sort(arry); // sıralama yaptık

        System.out.println("*****SORTED NUMBERS*****");
        for (int number : arry) {

            System.out.print(number + " ");
        }

    }
}
