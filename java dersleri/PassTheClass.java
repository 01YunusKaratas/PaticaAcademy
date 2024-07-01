import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] lesson = { "Turkish", "Math", "Physics", "Chemistry", "Music" };
        float[] points = new float[5];
        float total = 0;
        boolean valid = true;

        for (int i = 0; i < lesson.length; i++) {
            System.out.print("Please enter your " + lesson[i] + " point: ");
            points[i] = input.nextFloat();

            if (points[i] < 0 || points[i] > 100) {
                System.err.println("Invalid point for " + lesson[i] + ". Points should be between 0 and 100.");
                valid = false;
                break;
            }

            total += points[i];
        }

        if (valid) {
            System.out.println("*****************NOTE******************");
            for (int i = 0; i < lesson.length; i++) {
                System.out.println(lesson[i] + " NOTE: " + points[i]);
            }
            System.out.println("*********************************");

            float average = total / lesson.length;
            System.out.println("AVERAGE POINT: " + average);

            if (average >= 55) {
                System.out.println("Congratulations, you passed the exam.");
            } else {
                System.out.println("Unfortunately, you didn't pass the exam.");
            }
        } else {
            System.err.println("Please enter valid points (0-100) for all subjects.");
        }

        input.close();
    }
}
