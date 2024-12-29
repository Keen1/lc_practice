package leet.problem611;

import java.util.Arrays;

/*Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
*Valid Triangle means if you added length of any 2 side it will be greater than 3rd side length
* valid = side1 + side2 < side3
*
* */
public class Solution {
    //sliding window problem?
    //need to find all COMBINATIONS for which side1 + side2 < side3 is true

    public int triangleNumber(int[] nums){
        //base case
        if(nums == null || nums.length < 3){
            return 0;
        }
        int count = 0;

        Arrays.sort(nums);
        for(int i = 2; i < nums.length; i++){

            int j = 0;
            int k = i - 1;

            while(j < k){
                if(nums[i] + nums[j] > nums[k]){
                    count += (k - j);
                    k--;
                }else{
                    j++;
                }
            }
        }
        return count;
    }
}
