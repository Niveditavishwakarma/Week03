package stringbuffer.comparestringbuilderandstringbuffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTestTest {

    @Test
    void performanceTest() {
        long startTime, endTime;
        startTime = System.nanoTime();
        StringBuilder sbl = new StringBuilder();
        for(int i=0; i<1000000; i++)
        {
            sbl.append("Performance test");
        }
        endTime = System.nanoTime();
        long durationBuilder = endTime - startTime;

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for(int i=0; i<1000000; i++)
        {
            sbf.append("Performance test");
        }
        endTime = System.nanoTime();
        long durationBuffer = endTime - startTime;

        assertTrue(durationBuffer >= durationBuilder);
    }
}