package leet.problem28;

public class Solution {
    public int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(haystack.length() == needle.length()){
            if(haystack.compareTo(needle) != 0){
                return -1;

            }else{
                return 0;
            }
        }
        for(int i = 0; i < haystack.length(); i++){

            if(haystack.charAt(i) == needle.charAt(0)){
                boolean isMatch = true;
                for(int k = 1; k < needle.length(); k++){
                    if(haystack.charAt(i + k) != needle.charAt(k)){
                        isMatch = false;
                        break;
                    }

                }
                if(isMatch){
                    return i;
                }


            }


        }
        return -1;
    }
}
