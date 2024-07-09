import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the length : ('q-EXIT')");

            if (sc.hasNext("q")) {
                System.out.println("Exiting the system.");
                System.exit(0);
                break;
            } else if (!sc.hasNextInt()) {
                System.out.println("Please enter the a valid value!!");
                sc.next(); // cleaning
                continue; // repeat again loop
            } else {
                int length = sc.nextInt();
                int[] arry = new int[length];

                for (int i = 0; i < arry.length; i++) {
                    System.out.print("Number :");
                    if (!sc.hasNextInt()) {

                        System.out.println("Please enter the a valid value!!");
                        sc.next(); // cleaning

                    }

                    arry[i] = sc.nextInt(); // added number in the array .
                    System.out.println("*********************************");
                }
                Arrays.sort(arry); // order
                System.out.println("*********************** ORDERED ARRAY ***********************");
                System.out.println(Arrays.toString(arry));
                System.out.println("***************************************");

            }

        }

    }
}
