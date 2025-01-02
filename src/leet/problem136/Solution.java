package leet.problem136;

import java.util.Arrays;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
* */
public class Solution {
    public int singleNumber(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);
        int count = 0;
        while(count < nums.length){
            if(nums[count + 1] < nums.length && nums[count] != nums[count + 1]){
                return nums[count];
            }else{
                count++;
            }
        }
        return 0;
    }
}
