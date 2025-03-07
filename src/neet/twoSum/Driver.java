package neet.twoSum;

public class Driver {

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] testArr = {3,4,5,6};
        int target = 7;
        int[] result = sol.twoSum(testArr, target);
        System.out.printf("Result: %d, %d\n", result[0], result[1]);

        int[] testArr2 = {4,5,6};
        target = 10;
        result = sol.twoSum(testArr2, target);
        System.out.printf("Result: %d, %d\n", result[0], result[1]);

    }
}
