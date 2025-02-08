package comparisonofhashsetarraytreeset;

public class Main {
    public static void main(String[] args)
    {
        int[] input = {1000,100000,100000};
        for(int num :  input)
        {
            Comparison.measureTime(num);
        }
    }
}
