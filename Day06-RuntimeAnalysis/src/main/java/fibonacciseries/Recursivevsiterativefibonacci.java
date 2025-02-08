package fibonacciseries;

class Recursivevsiterativefibonacci {
    public static long recursiveFibonacci(int n)
    {
        if(n<=1) return (long)n;
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    public static long iterativeFibonacci(int n)
    {
        if(n<=1) return (long)n;
        long a=0,b=1,sum;
        for(int i=2; i<=n; i++)
        {
            sum = a+b;
            a=b;
            b=sum;
        }
        return b;
    }

    public static void measurePerformance(int n)
    {
        double startTime = System.nanoTime();
        long resultIterative = iterativeFibonacci(n);
        double timeIterative = (System.nanoTime() - startTime)/1000000;
        System.out.println("Time taken by iterative approach: " + timeIterative);
        System.out.println("result of iterative approach: " + resultIterative);

        startTime = System.nanoTime();
        long resultRecursive = recursiveFibonacci(n);
        double timeRecursive = (System.nanoTime() - startTime)/1000000;
        System.out.println("Time taken by recursive approach: " + timeRecursive);
        System.out.println("result of recursive approach: "+ resultRecursive);
        System.out.println();


    }
}
