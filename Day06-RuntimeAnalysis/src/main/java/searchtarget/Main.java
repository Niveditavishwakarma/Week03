package searchtarget;

public class Main {
    public static void main(String[] args)
    {
        int[] dataset = {1000,10000,1000000};
        int target = 997;
        for(int n : dataset)
        {
            SearchComparison.measureTime(n,target);
        }
    }
}
