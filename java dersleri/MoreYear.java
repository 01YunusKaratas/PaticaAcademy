import java.util.Scanner;

public class MoreYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        while (true) {
            System.out.print("Enter the year :");
            if (!input.hasNextInt()) { // girilenn yıl rakam değilse buraya gircek ve tekrara döndürülücek.
                System.out.println("Please enter the a valid year !!!");
                input.next();
            } else {
                year = input.nextInt(); // kullanıcıdan yıl değeri istenildi.

                if (year <= 0) {
                    System.out.println("Please enter the a valid year !!!");
                } else {

                    if (year % 4 == 0) {
                        if ((year % 100 == 0) && (year % 400 == 0)) {
                            System.out.println(year + " year is a leap year.");

                        } else {
                            System.out.println(year + " year is not a leap year.");

                        }
                    } else {
                        System.out.println(year + " year is not a leap year.");

                    }
                }
            }
        }

    }
}
