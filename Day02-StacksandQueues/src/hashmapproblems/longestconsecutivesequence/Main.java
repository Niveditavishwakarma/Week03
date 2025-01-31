package hashmapproblems.longestconsecutivesequence;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LongestConsecutiveSequence sequence = new LongestConsecutiveSequence();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int longestSequence = sequence.findLongestConsecutiveSequence(arr);
        System.out.println("Length of longest consecutive sequence: " + longestSequence);
    }
}
