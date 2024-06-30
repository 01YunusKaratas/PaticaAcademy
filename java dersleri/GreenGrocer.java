
/**
 * GreenGrocer
 */
import java.util.Scanner;

public class GreenGrocer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pear = 2.14f;
        float aubergine = 5.00f;
        float apple = 3.67f;
        float banana = 0.95f;
        float tomatoes = 1.11f;

        // total fee all

        float tpear;
        float taubergine;
        float tapple;
        float tbanana;
        float ttomatoes;

        System.out.print("How much do you wanna take pear ?  ");
        float kg_pear = sc.nextFloat();

        System.out.print("How much do you wanna take aubergine ?  ");
        float kg_aubergine = sc.nextFloat();
        System.out.print("How much do you wanna take apple ?  ");
        float kg_apple = sc.nextFloat();
        System.out.print("How much do you wanna take banana ?  ");
        float kg_banana = sc.nextFloat();
        System.out.print("How much do you wanna take tomatoes ?  ");
        float kg_tomatoes = sc.nextFloat();

        tpear = kg_pear * pear;
        taubergine = aubergine * kg_aubergine;
        tapple = kg_apple * apple;
        tbanana = banana * kg_banana;
        ttomatoes = tomatoes * kg_tomatoes;

        Float totalCost = tpear + taubergine + tapple + tbanana + ttomatoes;

        System.out.println("Total fee : " + "****" + totalCost + "****");

    }
}