package leet.problem151;


public class Solution {
    public String reverseWords(String s){
        StringBuilder reverseBuilder = new StringBuilder();
        reverseBuilder.ensureCapacity(s.length());

        int wordStart = s.length();
        for(int i = s.length() - 1 ; i >= 0; i--){
            if(s.charAt(i) == ' ' || i == 0){
                String word = s.substring(i, wordStart);
                if(i == 0){
                    word = " " + word;
                }
                reverseBuilder.append(word);
                System.out.println(word);
                wordStart = i;

            }
        }
        reverseBuilder.replace(0,1, "");

        return reverseBuilder.toString();


    }
}
