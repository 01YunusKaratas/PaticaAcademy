import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCountsWithHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the elements of the array:");
            array[i] = sc.nextInt();
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();
        int count = 0;

        for (int num : array) {
            if (!uniqueNumbers.add(num)) { // add returns false if num is already in the set
                if (!duplicateNumbers.contains(num)) {
                    duplicateNumbers.add(num);
                    count++;
                }
            }
        }

        System.out.println("Duplicate numbers and their counts:");
        for (int num : duplicateNumbers) {
            System.out.println(num + " : " + countOccurrences(array, num));
        }
    }

    // Method to count occurrences of a number in an array
    private static int countOccurrences(int[] array, int num) {
        int count = 0;
        for (int n : array) {
            if (n == num) {
                count++;
            }
        }
        return count;
    }
}
