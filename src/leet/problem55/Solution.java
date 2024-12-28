package leet.problem55;
/*
* You are given an integer array nums.
* You are initially positioned at the array's first index, and each element in the array
* represents your maximum jump length at that position.
* Return true if you can reach the last index, or false otherwise
*
* example
* imput nums = {2,3,1,1,4}
* output: true
* Jump 1 step from index 0 to 1, then 3 steps to the last index.
* */
class Solution {
    public boolean canJump(int[] nums){
        int lengthToJump = nums.length - 1;

        if(nums[0] - lengthToJump >= 0){
            return true;
        }
        int k = 0;
        int jumps = 0;
        while(k <= nums.length - 1){
            jumps = nums[k];

        }
        return true;


    }
}
