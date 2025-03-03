package neet.isAnagram;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        int count = 0;

        while(count < sArr.length){
            if(sArr[count] != tArr[count]){
                return false;
            }
            count++;
        }
        return true;
    }
}
