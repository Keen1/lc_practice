package neet.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> stringsList = new ArrayList<>();

        if(strs.length == 0){
            return stringsList;
        }

        if(strs.length == 1){
            List<String> subList = new ArrayList<>();
            subList.add(strs[0]);
            stringsList.add(subList);
            return stringsList;
        }

        List<String> subList = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            if()
        }


    }
}
