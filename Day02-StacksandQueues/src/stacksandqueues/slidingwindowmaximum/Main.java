package stacksandqueues.slidingwindowmaximum;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SlidingWindowMaximum window = new SlidingWindowMaximum();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(window.maxSlidingWindow(nums, k)));
    }
}

