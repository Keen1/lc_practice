package problem121;
/*
* You are given an array prices where prices[i] is the price of a given stock on the ith day.
* You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
* to sell that stock.
* Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
* Example
* input - prices = {7,1,5,3,6,4}
* output = 5
* Explanation: Buy on day 2 (price = 1) and sell on day 5(price = 6) profit = 6 - 1 = 5
* Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell*/

public class Solution {
    public int maxProfit(int[] prices){
        int profit = 0;
        for(int i = 0; i < prices.length; i++){

            int buy = prices[i];

            for(int k = i; k < prices.length; k++){
                int sell = prices[k];
                if(sell - buy >= profit){
                    profit = sell - buy;
                }
            }
        }

        return profit;
    }

    public int dynamicMaxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){

            if(price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
