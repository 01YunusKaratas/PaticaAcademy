import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length :");

        int length = sc.nextInt();
        int[] arry = new int[length]; // {1,2,3,4,5,6,6,7,8,8,9,10}

        Set<Integer> uniqueNumber = new HashSet<>(); // set kullandık .
        Set<Integer> duplicateNumber = new HashSet<>();

        for (int i = 0; i < arry.length; i++) {
            System.out.println("Enter the number for array :");
            arry[i] = sc.nextInt();
        }

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] % 2 == 0) {
                if (!uniqueNumber.add(arry[i])) {
                    duplicateNumber.add(arry[i]); // çift ve tekrar eden sayıları ekledik.
                }
            }
        }
        System.out.println("DUPLICATE NUMBER :" + duplicateNumber);

    }
}
