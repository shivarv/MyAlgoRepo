class Solution {
    public int maxProfit(int[] prices) {
        // code here
        int total = 0;
        int small = prices[0];
        for(int i = 1; i <prices.length; i++) {
            if(prices[i] < small) {
                small = prices[i];
            } else {
                if(i + 1 < prices.length && prices[i]> prices[i + 1]) {
                   total = total +  (prices[i] - small);
                    small = prices[i + 1];  
                }
                   
                else if(i + 1 == prices.length) {
                    total = total + prices[i] - small;
                }
                    
            }
        }
        return total;
    }
}