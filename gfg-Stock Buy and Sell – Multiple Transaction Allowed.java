// User function Template for Java
class Solution {
    public int maxProfit(int prices[]) {
        // code here
        int totalProfit = 0;
        int buyPrice = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - buyPrice > 0) {
                totalProfit += ( prices[i] - buyPrice);
                buyPrice = prices[i];
            } else {
                buyPrice = prices[i];
            }
        }
        return totalProfit;
    }
}