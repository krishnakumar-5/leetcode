// Last updated: 6/2/2026, 7:58:45 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5
6        int[][] dp = new int[n+1][m+1];
7
8        for(int i = 0; i <= n; i++){
9            dp[i][0] = i;
10        }
11        for(int j = 0; j <= m; j++){
12            dp[0][j] = j;
13        }
14        for(int i = 1; i <= n; i++){
15            for(int j = 1; j <= m; j++){
16                if(word1.charAt(i-1) == word2.charAt(j-1)){
17                    dp[i][j] = dp[i-1][j-1];
18                }else{
19                    int insert = 1 + dp[i][j-1];
20                    int delete = 1 + dp[i-1][j];
21                    int replace = 1 + dp[i-1][j-1];
22                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
23                }
24            }
25        }
26        return dp[n][m];
27    }
28}