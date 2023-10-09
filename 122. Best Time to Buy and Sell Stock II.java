/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.
*/

class Solution {
    public int maxProfit(int[] prices) {
        int end = prices.length - 1;
        boolean isBuyed = false;
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        for (int i = 0; i < end; i++) {
            if (isBuyed && prices[i] > prices[buyDay] && prices[i] > prices[i + 1]) {
                isBuyed = false;
                maxProfit += prices[i] - prices[buyDay];
            }

            if (!isBuyed && prices[i] < prices[i + 1]) {
                isBuyed = true;
                buyDay = i;
            }
        }
        if (isBuyed && prices[end] - prices[buyDay] > 0) {
            maxProfit += prices[end] - prices[buyDay];
        }
        return maxProfit;
    }
}
