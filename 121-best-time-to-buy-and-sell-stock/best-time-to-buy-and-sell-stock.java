class Solution {
    public int maxProfit(int[] prices) {

       int min = prices[0];
       int profit = 0;
        
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];    //if price at any index is less than min i.e 1st index , we update the min value i.e the buying price
            }
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}