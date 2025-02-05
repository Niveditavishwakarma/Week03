package challengeproblems.findmissingpositive;
public class Main {
    public static void main(String[] args)
    {
        int[] nums = {3, 4, -1, 1};
        int result = FindFirstMissingPositive.firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);
    }
}
