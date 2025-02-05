package filereader.wordcount;

public class Main {
    public static void main(String[] args)
    {
        String find = "git";
        int count = WordCount.countOccurance(find);
        System.out.println("number of times occurred: " + count);
    }
}
