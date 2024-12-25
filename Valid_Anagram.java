import java.util.*;
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc,tc);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "anagram";
        String t = "ngraama";
        isAnagram(s,t);
    }
}
