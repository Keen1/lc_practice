package leet.problem121;

public class Driver {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int profit = solution.maxProfit(prices);
        System.out.printf("max profit: %d\n", profit);
        profit = solution.dynamicMaxProfit(prices);
        System.out.printf("max profit: %d\n", profit);
    }
}
