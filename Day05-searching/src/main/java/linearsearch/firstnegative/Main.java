package linearsearch.firstnegative;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, -2, 5, 8 - 1};
        int result = FindFirstNegative.negativeInteger(arr);

        if (result != -1) {
            System.out.println("The first negative number is at: " + result);
        } else {
            System.out.println("No negative index found");
        }
    }
}
