import java.util.Scanner;

public class TemperatureClclte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the temperature today? :");

        float tempt = input.nextFloat();

        if (tempt < 5) {
            System.out.println("You can skiing");
        } else if (tempt >= 5 && tempt <= 15) {
            System.out.println("You can go to cinema");
        } else if (tempt > 15 && tempt <= 25) {
            System.out.println("You can go to picnic");
        } else if (tempt > 25) {
            System.out.println("You can swimming");
        }
    }

}
