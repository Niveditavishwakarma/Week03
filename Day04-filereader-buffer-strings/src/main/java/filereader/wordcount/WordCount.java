package filereader.wordcount;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class WordCount {
    public static int countOccurance(String find){
        try {
            String filepath = "C:/Users/asus/OneDrive/Desktop/Daily Learning notes/git commands.txt";
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line = "";
            int count = 0;
            while((line = br.readLine()) != null)
            {
                String[] words = line.split(" ");
                for(String word : words)
                {
                    if(find.equals(word)){
                        count++;
                    }
                }
            }
            return count;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
       return -1;
    }
}

