import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the matrix a-row and a-columnn length  : ('q-EXIT')");

            if (sc.hasNext("q")) {
                System.out.println("Exiting the system.");
                System.exit(0);
                break;
            } else if (!sc.hasNextInt()) {
                System.out.println("Please enter the a valid value!!");
                sc.next(); // cleaning
                continue; // repeat again loop

            } else {
                int row = sc.nextInt();
                int column = sc.nextInt();
                if (column == 0 || row == 0) {
                    System.out.println("Please enter the correct matrix length !!!");
                    continue;
                }

                int[][] arry = new int[row][column];
                int[][] transpose = new int[column][row];
                for (int i = 0; i < arry.length; i++) {
                    for (int j = 0; j < arry[i].length; j++) {
                        System.out.println("Enter the number :");
                        if (!sc.hasNextInt()) {
                            System.out.println("Enter the number please try again.!!!");
                            sc.next(); // cleaning and not go to start loop

                        }
                        arry[i][j] = sc.nextInt(); // user's value

                    }

                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        transpose[j][i] = arry[i][j]; // important
                    }
                }

                System.out.println("******************Matrix******************");

                for (int j = 0; j < row; j++) {
                    for (int i = 0; i < column; i++) {

                        System.out.print(arry[j][i] + " ");
                    }
                    System.out.println();
                }

                System.out.println("******************Transpose Matrix******************");

                for (int j = 0; j < column; j++) {
                    for (int i = 0; i < row; i++) {

                        System.out.print(transpose[j][i] + " ");
                    }
                    System.out.println();
                }

            }
        }
        sc.close();

    }
}
