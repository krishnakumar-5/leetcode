// Last updated: 6/1/2026, 2:26:20 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int dp[]=new int[amount+1];
4        Arrays.fill(dp,amount+1);
5        dp[0]=0;
6        for(int coin:coins){
7            for(int i=coin;i<=amount;i++){
8                dp[i]=Math.min(dp[i],dp[i-coin]+1);
9            }
10        }
11        if(dp[amount]>amount){
12            return -1;
13        }else{
14            return dp[amount];
15        }
16    }
17}