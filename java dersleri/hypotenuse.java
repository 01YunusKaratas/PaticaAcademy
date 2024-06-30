
/**
 * hypotenuse
 * Author -YUNUS EMRE KARATAŞ   
 */
import java.util.Scanner;
import java.lang.Math; // ı used Math module for square and pow 

public class hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of edge1 :");
        Float edge1 = sc.nextFloat();

        System.out.println("Enter the length of edge2 :");
        Float edge2 = sc.nextFloat();

        float hypotenuse = (float) (Math.pow(edge1, 2) + Math.pow(edge2, 2));
        hypotenuse = (float) Math.sqrt(hypotenuse);
        System.out.println("Hypotenuse :" + hypotenuse);

        float Perimeter = (edge1 + edge2 + hypotenuse);
        float Area = ((edge1 * edge2) / 2);

        System.out.println("Perimeter length :" + Perimeter);
        System.out.println("Area lenght :" + Area);

    }
}