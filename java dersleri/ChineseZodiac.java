
/**
 * Chinese Zodiac
 */
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        while (true) {
            System.out.println("Please enter the your birthyear :");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid value ,Try Again!!");
                sc.next();
            } else {
                year = sc.nextInt();
                if (year <= 0) {
                    System.out.println("Please enter the a valid value !!!");
                } else {
                    if (year % 12 == 0) {
                        System.out.println("Monkey");
                        break;
                    } else if (year % 12 == 1) {
                        System.out.println("Cockerel");
                        break;
                    } else if (year % 12 == 2) {
                        System.out.println("Dog");
                        break;
                    } else if (year % 12 == 3) {
                        System.out.println("Pig");
                        break;
                    } else if (year % 12 == 4) {
                        System.out.println("Mouse");
                        break;
                    } else if (year % 12 == 5) {
                        System.out.println("Ox");
                        break;
                    } else if (year % 12 == 6) {
                        System.out.println("Tiger");
                        break;
                    } else if (year % 12 == 7) {
                        System.out.println("Rabbit");
                        break;
                    } else if (year % 12 == 8) {
                        System.out.println("Dragon");
                        break;
                    } else if (year % 12 == 9) {
                        System.out.println("Horse");
                        break;
                    } else if (year % 12 == 10) {
                        System.out.println("Sheep");
                        break;
                    } else if (year % 12 == 11) {
                        System.out.println("cockerel");
                        break;
                    } else {
                        System.out.println("Please enter the correct a valid ");

                    }

                }

            }

        }

    }

}