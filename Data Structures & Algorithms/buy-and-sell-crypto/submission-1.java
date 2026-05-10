class Solution {
    public int maxProfit(int[] prices) {
        var max = 0;
        var left = 0;
        var right =  1;
        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                var profit = prices[right] - prices[left];
                if(profit > max) {
                    max = profit;
                }
            } else {
                left = right;
            }

            right++;
        }
        return max;
    }
}
