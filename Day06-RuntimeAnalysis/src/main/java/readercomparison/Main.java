package readercomparison;
public class Main {
    public static void main(String[] args)
    {
        try{
            String filepath = "C:/Users/asus/Downloads/100mb-examplefile-com.txt";
            double fileReaderTime = ReaderPerformance.fileReader(filepath);
            System.out.println("Time taken by file reader is: " + fileReaderTime);
            double inputStreamReaderTime = ReaderPerformance.inputStreamReader(filepath);
            System.out.println("Time taken by inputstream reader is: " + inputStreamReaderTime);

        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
    }
}
