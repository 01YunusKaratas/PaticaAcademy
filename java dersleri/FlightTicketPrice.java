import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km, age;
        float perUnitKm = 0.1f;
        float totalFee = 0;

        // km bilgisi
        System.out.println("Please enter the km:");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid km:");
            sc.next();
        }
        km = sc.nextInt();
        totalFee = km * perUnitKm;

        // yaş bilgisi
        System.out.println("Please enter the age:");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid age:");
            sc.next();
        }
        age = sc.nextInt();

        // yaşa göre indirim hesaplaması
        if (age < 12) {
            System.out.println("TotalFee :" + totalFee);
            System.out.println("Congratulations, You win a 50% discount.");
            totalFee *= 0.5; // %50 indirim
        } else if (age >= 12 && age <= 24) {
            System.out.println("TotalFee :" + totalFee);
            System.out.println("Congratulations, You win a 10% discount.");
            totalFee *= 0.9; // %10 indirim
        } else if (age > 65) {
            System.out.println("TotalFee :" + totalFee);
            System.out.println("Congratulations, You win a 30% discount.");
            totalFee *= 0.7; // %30 indirim
        }

        System.out.println("Total Fee after age discount: " + totalFee);

        // Trip Type
        System.out.println("Enter the trip type (1 => One Way, 2 => Round Trip)");
        while (true) {
            if (sc.hasNextInt()) {
                int way = sc.nextInt();
                if (way == 1) {
                    System.out.println("Trip Type: One Way");
                    break;
                } else if (way == 2) {
                    System.out.println("Trip Type: Round Trip");
                    System.out.println("TotalFee :" + totalFee);
                    System.out.println("Congratulations, You win a 20% discount.");
                    totalFee *= 0.8; // %20 indirim
                    System.out.println("New Fee: " + totalFee);
                    break;
                } else {
                    System.out.println("Please enter a valid trip type (1 or 2)");
                }
            } else {
                System.out.println("Please enter a valid trip type (1 or 2)");
                sc.next(); // Geçersiz girişi temizle
            }
        }
        System.out.println("*************************************");
        System.out.println("KM :" + km + "\nAGE :" + age + "\nTOTALFEE :" + totalFee);

        // Scanner kapat
        sc.close();
    }
}
