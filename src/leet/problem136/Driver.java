package leet.problem136;

public class Driver {
    public static void main(String[] args){
        int[] nums = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        Solution sol = new Solution();
        int result = sol.singleNumber(nums);
        System.out.printf("Answer: %d", result);
        result = sol.singleNumber(nums2);
        System.out.printf("Answer: %d", result);



    }
}
