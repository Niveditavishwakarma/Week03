package hashmapproblems.subarraywithzerosum;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        ZeroSumSubarray zerosum = new ZeroSumSubarray();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<int[]> subarrays = zerosum.findZeroSumSubarrays(arr);

        System.out.println("Zero sum subarrays:");
        for (int[] subarray : subarrays) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}

