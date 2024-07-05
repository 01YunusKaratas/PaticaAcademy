import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean triangle = false;
        int num;
        int i;
        while (!triangle) {
            System.out.println("Enter the number for length of triangle  :");
            if (!input.hasNextInt()) {
                System.out.println("Please enter the a valid bit. ('q-EXIT')");
                if (input.hasNext("q")) {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                input.next();

            } else {
                num = input.nextInt();
                for (i = num; i >= 1; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }
            }

        }
    }
}
