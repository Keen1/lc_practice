package leet.problem80;

public class Driver {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int[] expectedNums = {1,1,2,2,3};
        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);
        assert k == expectedNums.length;
        for(int i = 0; i < k; i++){
            assert nums[i] == expectedNums[i];
        }
    }
}
