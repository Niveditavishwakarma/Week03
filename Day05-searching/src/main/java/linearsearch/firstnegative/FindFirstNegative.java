package linearsearch.firstnegative;

public class FindFirstNegative {
    public static int negativeInteger(int[] arr)
    {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
                return i;
        }
        return -1;
    }
}
