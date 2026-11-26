class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int min = Integer.MAX_VALUE;
        int max_profit=0;
        for(int i:prices){
            if(min>i){
                min = i;
                
            }
            max_profit = Math.max(max_profit, i-min);
        }
        return max_profit;
    }
}
