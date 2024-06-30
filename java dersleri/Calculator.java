import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number1: ");
            float num1 = getValidFloat(input); // Sayı girişini kontrol eden yardımcı metot

            System.out.print("Enter number2: ");
            float num2 = getValidFloat(input); // Sayı girişini kontrol eden yardımcı metot

            System.out.println("*********************************");
            System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
            System.out.println("*********************************");
            System.out.print("Enter your choice: ");

            int choose = input.nextInt();

            float total;
            switch (choose) {
                case 1:
                    total = num1 + num2;
                    System.out.println("RESULT: " + total);
                    break;
                case 2:
                    total = num1 - num2;
                    System.out.println("RESULT: " + total);
                    break;
                case 3:
                    total = num1 * num2;
                    System.out.println("RESULT: " + total);
                    break;
                case 4:
                    if (num2 != 0) {
                        total = num1 / num2;
                        System.out.println("RESULT: " + total);
                    } else {
                        System.out.println("Cannot divide by zero! Please enter a non-zero number.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }

            // Kullanıcıya devam etmek isteyip istemediğini sor
            System.out.println("\nDo you want to perform another calculation? (yes/no)");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("yes")) {
                break; // Kullanıcı devam etmek istemiyorsa döngüden çık
            }
        }

        System.out.println("Calculator closed. Goodbye!");
        input.close();
    }

    // Kullanıcıdan geçerli bir float sayı alana kadar tekrar giriş yapmasını
    // isteyen metot
    private static float getValidFloat(Scanner input) {
        float number;
        while (true) {
            System.out.print("Enter a number: ");
            if (input.hasNextFloat()) {
                number = input.nextFloat();
                break; // Geçerli bir float sayı alındığında döngüden çık
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                input.next(); // Hatalı girdiyi oku ve atla
            }
        }
        return number;
    }
}
