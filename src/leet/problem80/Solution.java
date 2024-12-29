package leet.problem80;
/*Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
*
*
* */

public class Solution {
    //two pointer approach
    //I think basically the way of understanding this is that the fast pointer is checking for duplicates
    //while our slow pointer is keeping our position for in place management of the data structure.

    public int removeDuplicates(int[] nums){
        //edge case if the array is empty
        if(nums.length == 0){
            return 0;
        }

        //count and the in place pointer start at 1 since we can automatically count the first occurrence of ANY digit
        //in the array
        int count = 1;
        int slowPos = 1;

        //the fast pointer also starts at 1 -- this is since we can IMPLICITLY count the first element. And we ALWAYS
        //need to look back one in the fast iterations because this is where duplicate comparison is occurring.

        for(int fast = 1; fast < nums.length; fast++){

            //if the current fast index matches the previous, we have a duplicate and increase the count
            if(nums[fast] == nums[fast - 1]){
                count++;

            //if we encounter a NEW element, reset the count to 1
            }else{

                count = 1;
            }

            //the problem states that numbers can occur AT MOST twice. This translates to count <= 2 we place the element
            //in the NEXT AVAILABLE position(our current placement of the slowPos pointer <--- the in place manager.
            if(count <= 2){
                nums[slowPos] = nums[fast];
                slowPos++;
            }

        }

        //at this point the array has been iterated through and we can return our slowPos counter(this is the last index
        //that we managed and placed in the array
        return slowPos;


    }
}
