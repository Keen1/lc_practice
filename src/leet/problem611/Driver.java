package leet.problem611;

public class Driver {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {2,2,3,4};
        int answer = solution.triangleNumber(nums);
        System.out.println("Array: ");
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                System.out.print("{ ");
            }
            System.out.printf("%d ", nums[i]);
            if(i == nums.length - 1){
                System.out.print("}\n");
            }

        }
        System.out.printf("Answer: %d", answer);
    }
}
