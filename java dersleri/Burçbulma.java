import java.time.LocalDate;
import java.util.Scanner;

public class Burçbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year:");
        int year = input.nextInt();

        System.out.println("Enter your month:");
        int months = input.nextInt();

        System.out.println("Enter your day:");
        int days = input.nextInt();

        LocalDate fulldate = LocalDate.of(year, months, days);

        System.out.println(fulldate);

        System.out.println("Do you wanna learn the horoscope ?\n 1-YES ,2-NO");

        int reguest = input.nextInt();

        if (reguest == 1) {
            if ((months == 3 && days >= 21) || (months == 4 && days <= 19)) {
                System.out.println("Aries");
            } else if ((months == 4 && days >= 20) || (months == 5 && days <= 20)) {
                System.out.println("Taurus");
            } else if ((months == 5 && days >= 21) || (months == 6 && days <= 20)) {
                System.out.println("Gemini");
            } else if ((months == 6 && days >= 21) || (months == 7 && days <= 22)) {
                System.out.println("Cancer");
            } else if ((months == 7 && days >= 23) || (months == 8 && days <= 22)) {
                System.out.println("Leo");
            } else if ((months == 8 && days >= 23) || (months == 9 && days <= 22)) {
                System.out.println("Virgo");
            } else if ((months == 9 && days >= 23) || (months == 10 && days <= 22)) {
                System.out.println("Libra");
            } else if ((months == 10 && days >= 23) || (months == 11 && days <= 21)) {
                System.out.println("Scorpio");
            } else if ((months == 11 && days >= 22) || (months == 12 && days <= 21)) {
                System.out.println("Sagittarius");
            } else if ((months == 12 && days >= 22) || (months == 1 && days <= 19)) {
                System.out.println("Capricorn");
            } else if ((months == 1 && days >= 20) || (months == 2 && days <= 18)) {
                System.out.println("Aquarius");
            } else if ((months == 2 && days >= 19) || (months == 3 && days <= 20)) {
                System.out.println("Pisces");
            } else {
                System.err.println("Enter the correct answer,TRY AGAIN!!1");
            }
        } else {
            System.out.println("Your birthday :" + fulldate + "\n Have a nice day");
        }

        input.close();
    }
}
