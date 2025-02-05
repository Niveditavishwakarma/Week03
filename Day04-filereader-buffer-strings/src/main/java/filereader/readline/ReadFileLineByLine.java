package filereader.readline;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class ReadFileLineByLine {
    public static void main(String[] args)
    {
        String filepath = "C:/Users/asus/OneDrive/Desktop/Daily Learning notes/git commands.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;
            while((line = br.readLine()) != null)
            {

                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
