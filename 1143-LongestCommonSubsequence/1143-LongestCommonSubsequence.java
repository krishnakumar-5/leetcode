// Last updated: 6/2/2026, 11:45:47 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int t1=text1.length();
4        int t2=text2.length();
5        int dp[][]=new int[t1+1][t2+1];
6        for(int i=1;i<=t1;i++){
7            for(int j=1;j<=t2;j++){
8                if(text1.charAt(i-1)==text2.charAt(j-1)){
9                    dp[i][j]=1+dp[i-1][j-1];
10                }else{
11                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
12                }
13            }
14        }
15        return dp[t1][t2];
16    }
17}