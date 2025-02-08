package readercomparison;
import java.io.*;

class ReaderPerformance {
    public static double fileReader(String filepath) throws IOException
    {
        FileReader reader = new FileReader(filepath);
        long startTime = System.nanoTime();
        while(reader.read() != -1);
        return (double)(System.nanoTime() - startTime)/1000000;
    }

    public static double inputStreamReader(String filepath) throws IOException{
        InputStreamReader reader  = new InputStreamReader(new FileInputStream(filepath));
        long startTime = System.nanoTime();
        while(reader.read() != -1);
        return (double)(System.nanoTime()-startTime)/1000000;

    }
}
