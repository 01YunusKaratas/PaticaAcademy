import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for Palindrom Number:");
        int a = input.nextInt();

        IsPalindrom(a);

    }

    public static Boolean IsPalindrom(int num) {

        int number = num, reversedNumber = 0, lastnumber;

        while (num != 0) {
            lastnumber = num % 10; // son rakam
            reversedNumber = (reversedNumber * 10) + lastnumber;
            num /= 10; // num değişkenini 10'a böler, son basamağı siler

        }
        if (number == reversedNumber) {
            System.out.println(number + " is a Palindrom Number");
        } else {
            System.out.println(number + " is not Palindrom Number");
        }

        return true;
    }

}
