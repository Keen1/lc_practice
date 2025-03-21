package leet.problem35;

public class Solution {
    public int searchInsert(int[] nums, int target){
        //set vars for binary search
        int start = 0;
        int end = nums.length - 1;


        while(start < end){
            int middle = (start + end) / 2;
            if(target == nums[middle]){
                return middle;
            }
            if(nums[middle] < target){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }
        return start;
    }
}
