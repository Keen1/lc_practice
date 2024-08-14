package leet.problem2053;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] testArr1 = {"d","b","c","b","c","a"};
        int testK1 = 2;

        String returnValue;
        returnValue = solution.kthDistinct(testArr1, testK1);
        System.out.println(returnValue);
    }
}
