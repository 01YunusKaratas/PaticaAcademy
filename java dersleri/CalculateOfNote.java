
/**
 * CalculateOfNote
 * Author = YUNUS EMRE KARATAŞ
 */
import java.util.Scanner;

public class CalculateOfNote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Math grade:"); // math note
        int mathnote = input.nextInt();

        System.out.println("Please enter your Chemistry grade:"); // Chemistry note
        int Chemistrynote = input.nextInt();

        System.out.println("Please enter your Turkısh grade:"); // Turkish note
        int Turkıshnote = input.nextInt();

        System.out.println("Please enter your Hıstory grade:"); // Hıstory note
        int Hıstorynote = input.nextInt();

        System.out.println("Please enter your Musıc grade:"); // Music note
        int Musıcnote = input.nextInt();

        int averagenote = ((mathnote + Chemistrynote + Turkıshnote + Hıstorynote + Musıcnote) / 5);

        System.out.printf("Total Average Note :%s%n", averagenote);

        if (averagenote >= 60) {
            System.out.println("you passed the class");
        } else {
            System.out.println("you didn't pass the class");
        }

    }
}
