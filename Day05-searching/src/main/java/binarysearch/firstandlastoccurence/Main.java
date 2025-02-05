package binarysearch.firstandlastoccurence;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7, 8, 9};
        int target = 4;
        int[] result = BinarySearchFirstAndLast.searchRange(arr, target);
        System.out.println("First and Last occurrence of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
