package problem189;
//given an integer array nums, rotate the array to the right by k steps, where k is non-negative

public class Solution {
    public int[] rotate(int[] nums, int k){
        int[] rotated = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int newIndex = (i + k) % nums.length;
            rotated[newIndex] = nums[i];
        }
        return rotated;
    }

    public void rotateInPlace(int[] nums, int k){
        int temp;
        for(int i = 0; i < nums.length; i++){
            int newIndex = (i + k) % nums.length;
            temp = nums[newIndex];
            nums[newIndex] = nums[i];
            nums[i] = temp;

        }
    }
}
