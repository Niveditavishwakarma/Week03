package linearsearch.searchword;

class WordSearch {
    public static String findWord(String[] sentences, String word){
        for(String sentence : sentences)
        {
            if(sentence.contains(word))
                return sentence;
        }
        return "not found";
    }

}
