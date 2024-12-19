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
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
