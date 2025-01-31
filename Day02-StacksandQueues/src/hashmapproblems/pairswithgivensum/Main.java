package hashmapproblems.pairswithgivensum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PairWithGivenSum sum = new PairWithGivenSum();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        int[] result = sum.findPairWithSum(arr, target);
        if (result != null) {
            System.out.println("Pair with given sum: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair with given sum found.");
        }
    }
}
