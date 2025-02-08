package stringcomparison;

public class Main {
    public static void main(String[] args)
    {
        int[] dataset = {1000,10000,1000000};
        for(int i=0; i<dataset.length; i++)
        {
            StringConcatenationPerformance.measureTime(dataset[i]);
        }
    }
}
