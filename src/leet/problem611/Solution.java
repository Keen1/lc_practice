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
        for(int i = 0; i < nums.length; i++){
            Arrays.sort(nums);
        }
    }
}
