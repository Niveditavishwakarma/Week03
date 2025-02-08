package comparesortingalgorithm;

public class Main {
    public static void main(String[] args)
    {
        int[] dataset = {1000,10000,1000000};
        for(int n : dataset)
        {
            SortingComparison.measureSortingTime(n);
        }
    }
}
