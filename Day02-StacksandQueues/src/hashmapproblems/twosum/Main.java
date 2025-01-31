package hashmapproblems.twosum;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        twoSum sum = new twoSum();
        int[] arr= {2,7,11,15};
        int target = 9;
        int[] result = sum.calculatetwoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
