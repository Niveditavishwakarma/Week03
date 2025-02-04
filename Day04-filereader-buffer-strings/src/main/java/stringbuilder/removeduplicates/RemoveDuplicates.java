package stringbuilder.removeduplicates;
import java.util.HashSet;
class RemoveDuplicates {
    static HashSet<Character> seen = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static String removeDuplicates(String input)
    {
        if(input == null)
         return null;
        seen.clear();
        sb.setLength(0);
        for(char ch : input.toCharArray())
        {
            if(!seen.contains(ch))
            {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
