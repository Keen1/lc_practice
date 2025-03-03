package neet.containsDupe;

import java.util.HashMap;
public class Solution {
    public boolean hasDuplicate(int[] nums){
        HashMap<Integer, Integer> numMap = new HashMap<>();

        int count = 0;
        while(count < nums.length){
            if(!numMap.containsKey(nums[count])){
                numMap.put(nums[count], 1);
                count++;
            }else{
                return true;
            }
        }
        return false;
    }
}
