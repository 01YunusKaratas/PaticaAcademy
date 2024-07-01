import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        float avg = 0f;
        System.out.print("Please enter the number : ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                avg += i; // added number for average value
                System.out.println(i + " Number added ");

            } else {
                System.out.println(i + " don't divide !!");
            }
        }
        float total = avg / num;
        System.out.println("AVERAGE :" + total);

    }
}
