class Solution {


    ///Time O(n)
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int profit = 0;
        int price = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < price){
                price = prices[i];
            }
            profit = Math.max(profit, prices[i] - price);
        }
        
        return profit;
    }



    ///Time O(n^2)
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int profit = 0;
        
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] < prices[j]){
                    profit = Math.max(profit, prices[j] - prices[i]);
                }
            }
        }
        
        return profit;
    }
}