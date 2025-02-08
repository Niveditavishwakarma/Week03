package fibonacciseries;

public class Main {
    public static void main(String[] args)
    {
        int[] input = {10,30,50};
        for(int data : input)
        {
            Recursivevsiterativefibonacci.measurePerformance(data);
        }
    }
}
