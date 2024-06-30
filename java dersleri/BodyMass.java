import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float weight;
        float length;

        System.out.println("Enter the your Weight:");
        weight = sc.nextFloat();

        System.out.println("Enter the your length:"); // the value must be in meters
        length = sc.nextFloat();

        float formulOfMass = (weight / (length * length));

        System.out.printf("Your Body Mass : %s%n ", formulOfMass);

    }

}
