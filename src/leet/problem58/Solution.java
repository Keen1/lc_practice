package leet.problem58;

public class Solution {
    public int lengthOfLastWord(String s){

        int lastWordLength = 0;
        for(int i = s.length() - 1; i >= 0; i--){

            if(Character.isLetter(s.charAt(i))){
                int k = i;
                while(k >= 0 && !Character.isSpaceChar(s.charAt(k))){
                    lastWordLength++;
                    k--;

                }
                return lastWordLength;
            }

        }
        return 0;
    }
}
