class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int len = prices.length;
        
        int[] left = new int[len];
        int minPrice = prices[0];
        left[0] = 0;
        for(int i = 1; i < len; i++){
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - minPrice);
        }
        
        int[] right = new int[len];
        int maxPrice = prices[len-1];
        right[len-1] = 0;
        for(int j = len - 2; j >=0; j--){
            maxPrice = Math.max(maxPrice, prices[j]);
            right[j] = Math.max(right[j+1], maxPrice - prices[j]);
        }
        
        int maxProfit = 0;
        for(int p = 0; p < len; p++){
            maxProfit = Math.max(maxProfit, left[p] + right[p]);
        }
        return maxProfit;
    }
}