class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min=prices[0];
        int max=0;
        int maxPrice=0;
        for(int i=0;i<n;i++)
        { 
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
            maxPrice=max;

        }
        return maxPrice;
    }

}