package stringbuffer.concatenatestrings;

class ConcatenateStrings {
    public static String concatenateStrings(String words[])
    {
        if(words.length == 0 )
            return "";
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}
