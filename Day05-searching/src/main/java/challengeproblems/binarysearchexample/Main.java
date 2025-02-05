package challengeproblems.binarysearchexample;

public class Main {
    public static void main(String[] args)
    {
        int[] nums = {7, 2, 5, 1, 3, 4, 6};
        int target = 4;
        int result = BinarySearchExample.binarySearch(nums, target);

        if (result != -1) {
            System.out.println("The target " + target + " is found at index: " + result);
        } else {
            System.out.println("The target " + target + " is not found.");
        }
    }
}
