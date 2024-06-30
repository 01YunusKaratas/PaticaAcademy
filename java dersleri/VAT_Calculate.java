import java.util.Scanner;

public class VAT_Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of money :");

        float money = input.nextInt();

        if (money >= 0 && money <= 1000) {
            float VAT_amount = 0.18f; // KDV amount

            float money1 = VAT_amount * money;
            float VAT = money1 + money;
            System.out.println("Price without VAT." + money);
            System.out.println("Price with VAT:" + VAT);
            System.out.println("price VAT:" + money1);

        } else if (money > 1000) {
            float VAT_amount = 0.08f; // KDV amount

            float money1 = VAT_amount * money;
            float VAT = money1 + money;
            System.out.println("Price without VAT." + money);
            System.out.println("Price with VAT:" + VAT);
            System.out.println("price VAT:" + money1);
        } else {

            System.out.println("Please ,enter the correct amount of money !Thanks a lot");
        }

    }

}
