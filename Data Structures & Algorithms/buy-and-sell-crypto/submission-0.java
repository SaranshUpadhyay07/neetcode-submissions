class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int ans = 0;

        while(j < prices.length){
            if(prices[j] < prices[i]) i = j;
            else ans = Math.max(ans,(prices[j]-prices[i]));
            j++;
        }
        return ans;
    }
}
