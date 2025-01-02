package leet.problem55;
/*
You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
*/

public class Solution {

    boolean canJump(int[] nums){

        int goal = nums.length;
        int jumpPower = 0;
        if(jumpPower == goal){
            return true;
        }

        while(jumpPower < goal){

            jumpPower += nums[jumpPower];


        }
        return false;
    }
}
