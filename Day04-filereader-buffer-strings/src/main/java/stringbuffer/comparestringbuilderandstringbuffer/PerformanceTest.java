package stringbuffer.comparestringbuilderandstringbuffer;
class PerformanceTest {
    public static void performanceTest(){
        long startTime, endTime;
        startTime = System.nanoTime();
        StringBuilder sbl = new StringBuilder();
        for(int i=0; i<1000000; i++)
        {
            sbl.append("Performance test");
        }
        endTime = System.nanoTime();
        System.out.println("Time required for StringBuilder: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for(int i=0; i<1000000; i++)
        {
            sbf.append("Performance test");
        }
        endTime = System.nanoTime();
        System.out.println("Time required for StringBuffer: " + (endTime - startTime + " ns"));
    }
}
