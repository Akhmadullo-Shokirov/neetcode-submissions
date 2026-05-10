class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <=1) return 0;
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while(right < prices.length) {
            int currProfit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, currProfit);
            if(prices[right] < prices[left]) {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
