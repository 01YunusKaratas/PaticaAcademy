import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the array (or 'q' to EXIT):");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter the a valid value !!!");
                if (sc.hasNext("q")) {
                    System.out.println("Exiting the system.");
                    System.exit(0);
                    break;
                }
                sc.next(); // siliyor girilen değeri
            } else {
                int length = sc.nextInt();

                int[] arry = new int[length];
                int total = 0;
                if (arry.length == 0) {
                    System.out.println("ARRAY is empty ");
                } else {
                    for (int i = 0; i < arry.length; i++) {
                        System.out.println("Enter the value for array :");
                        arry[i] = sc.nextInt(); // kullanıcıdan bilgileri aldık.

                        total += arry[i];

                    }

                    System.out.println("**********ARRAY**********");
                    System.out.println(Arrays.toString(arry));
                    int average = total / arry.length;
                    System.out.println("AVERAGE :" + average);

                }

            }

        }
        sc.close();
    }
}
