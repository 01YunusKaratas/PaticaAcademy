import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (!false) {
            System.out.print("Enter the palindrom word:");
            String value = sc.nextLine();
            System.out.println(plndrom(value));
        }

    }

    public static boolean plndrom(String str) {

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("------------");
                return false;
            }
            i++;
            j--;

        }
        System.out.println("------------");
        return true;
    }

}
