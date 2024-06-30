import java.util.Scanner;

public class TaxıFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float openFee = 10.0f;
        float per_unit_km = 2.2f;

        System.out.println("How much will you go km ? :");

        float km = sc.nextFloat();

        float total_fee = (km * per_unit_km) + openFee;

        if (total_fee <= 20) {
            total_fee = 20;
            System.out.println("Total Fee :" + total_fee);
        } else {
            System.out.println("Total Fee :" + total_fee);

        }

    }

}
