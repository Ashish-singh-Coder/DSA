class Solution {
    public int maxProfit(int[] prices) {

        int cheapest = Integer.MAX_VALUE;
        int bestProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];

            if (price < cheapest) {
                cheapest = price;             

            } else {
                int profit = price - cheapest;
                if (profit > bestProfit) {
                    bestProfit = profit; 
                }
            }
        }

        return bestProfit;
    }
}
        
    
