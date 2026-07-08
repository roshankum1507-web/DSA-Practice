class Solution {
    public int maxProfit(int[] prices) {

       int minvalue = Integer.MAX_VALUE;
       int maxprofit = 0;

       for(int i : prices){

        minvalue = Math.min(minvalue , i);
        maxprofit = Math.max(maxprofit , i - minvalue);
       }

       return maxprofit;
        
    }
}