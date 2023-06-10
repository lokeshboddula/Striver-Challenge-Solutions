class Solution {
    public int maxProfit(int[] prices) {

        int currMin = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(currMin > prices[i]) 
                currMin = prices[i];
            
            maxProfit = Math.max(maxProfit, prices[i] - currMin);
        }

        return maxProfit;
    }
}