package linearsearch.searchword;

public class Main {
    public static void main(String[] args)
    {
        String[] sentences = {
                "Java is a powerful programming language.",
                "Linear search is a simple search algorithm.",
                "This sentence contains the word 'search'.",
                "We are learning algorithms today."
        };
        String wordsToFind = "search";
        String result = WordSearch.findWord(sentences,wordsToFind);
        System.out.println("result: " + result);
    }
}
