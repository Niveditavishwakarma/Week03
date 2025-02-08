package stringcomparison;

class StringConcatenationPerformance {
    public static void testWithString(int n)
    {
        String result = "";
        for(int i=0; i<n; i++)
        {
            result += "a";
        }
    }

    public static void testWithStringBuilder(int n)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            sb.append("a");
        }
    }

    public static void testWithStringBuffer(int n)
    {
        StringBuffer sbf = new StringBuffer();
        for(int i=0 ;i<n; i++)
        {
            sbf.append("a");
        }
    }

    public static void measureTime(int n)
    {
        long startTime = System.nanoTime();
        testWithString(n);
        long StringDuration = System.nanoTime() - startTime;
        System.out.println("Time taken by String: " + (double)StringDuration/1000000);

        startTime = System.nanoTime();
        testWithStringBuilder(n);
        long StringBuilderDuration = System.nanoTime() - startTime;
        System.out.println("Time taken by StringBuilder: " + (double)StringBuilderDuration/1000000);

        startTime = System.nanoTime();
        testWithStringBuffer(n);
        long StringBufferDuration = System.nanoTime() - startTime;
        System.out.println("Time taken by StringBuffer: " + (double)StringBufferDuration/1000000);
        System.out.println();
    }
}
