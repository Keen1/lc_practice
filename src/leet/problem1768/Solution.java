package leet.problem1768;
import java.util.Stack;
public class Solution {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedStringBuilder = new StringBuilder();
        int finalLength = word1.length() + word2.length();
        int word1ptr = 0;
        int word2ptr = 0;
        for (int i = 0; i < finalLength; i++) {
            if (i % 2 == 0) {
                try {
                    mergedStringBuilder.append(word1.charAt(word1ptr));
                    word1ptr++;
                } catch (IndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                }
            }else{
                try{
                    mergedStringBuilder.append(word2.charAt(word2ptr));
                    word2ptr++;
                }catch(IndexOutOfBoundsException e){
                    System.err.println(e.getMessage());
                }
            }
        }
        return mergedStringBuilder.toString();
    }

}
