package challengeproblems.binarysearchexample;
import java.util.Arrays;
public class BinarySearchExample {
        public static int binarySearch(int[] nums, int target) {
            Arrays.sort(nums);

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[mid] > target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            return -1;
        }
}
