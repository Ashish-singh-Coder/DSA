1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int cheapest = Integer.MAX_VALUE;
5        int bestProfit = 0;
6
7        for (int i = 0; i < prices.length; i++) {
8            int price = prices[i];
9
10            if (price < cheapest) {
11                cheapest = price;             
12
13            } else {
14                int profit = price - cheapest;
15                if (profit > bestProfit) {
16                    bestProfit = profit; 
17                }
18            }
19        }
20
21        return bestProfit;
22    }
23}
24        
25    
26