package hashmapproblems.pairswithgivensum;
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

        public static int[] findPairWithSum(int[] arr, int target) {
            Set<Integer> seen = new HashSet<>();

            for (int num : arr) {
                int complement = target - num;
                if (seen.contains(complement)) {
                    return new int[]{complement, num};
                }
                seen.add(num);
            }
            return null;
        }
}
