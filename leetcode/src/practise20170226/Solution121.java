package practise20170226;

/**
 * Created by troy on 2017/2/26.
 * 121. Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction(ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        /*if(prices.length == 0 || prices == null) {
            return 0;
        }
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = profit < (prices[j] - prices[i]) ? (prices[j] - prices[i]) : profit;
            }
        }
        return profit;*/
        if (prices.length == 0 || prices == null) {
            return 0;
        }
        int profit = 0;
        int curProfit = 0;
        // 找参考点相减，B比A多出4，C比B少2，D与C多3，那么D久比B多1，so，B比A多5
        for (int i = 0; i < prices.length - 1; i++) {
            curProfit = Math.max(0, curProfit + prices[i + 1] - prices[i]);
            profit = Math.max(profit, curProfit);
        }
        return profit;
    }
}
