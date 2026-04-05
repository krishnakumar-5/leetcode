// Last updated: 4/5/2026, 7:15:41 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int res=prices[0];
4        int pro=0;
5        for(int i=1;i<prices.length;i++){
6             if(prices[i]<res){
7                res=prices[i];
8             }else if(prices[i]-res>pro){
9                pro=prices[i]-res;
10             }
11        }
12        return pro;
13    }
14}