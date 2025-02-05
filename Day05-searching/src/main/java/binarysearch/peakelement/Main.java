package binarysearch.peakelement;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = PeakElementFinder.findPeakElement(arr);
        System.out.println("A peak element is: " + peak);
    }
}
