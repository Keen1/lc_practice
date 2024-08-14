package leet.problem2053;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Solution(){

    }
    public String kthDistinct(String[] arr, int k){
        HashMap<String, Integer> map = new HashMap<>();

        int lastDistinct = 0;
        for(String s : arr){
            if (!map.containsKey(s)) {
                lastDistinct += 1;
                map.put(s, lastDistinct);
            }else{
                map.remove(s);
                lastDistinct -= 1;
            }
        }


        if(map.containsValue(k)){
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(entry.getValue().equals(k)){
                    return entry.getKey();
                }
            }
        }
        return "";


    }
}
