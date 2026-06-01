// Last updated: 6/1/2026, 9:03:42 PM
1public class Solution {
2    public int numDecodings(String s) {
3        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
4            return 0;
5        }
6        int n = s.length();
7        int[] dp = new int[n + 1];
8        dp[0] = 1;
9        dp[1] = 1;
10        for (int i = 2; i <= n; ++i) {
11            int oneDigit = s.charAt(i - 1) - '0';
12            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
13            if (oneDigit != 0) {
14                dp[i] += dp[i - 1];
15            }
16            if (10 <= twoDigits && twoDigits <= 26) {
17                dp[i] += dp[i - 2];
18            }
19        }
20        return dp[n];
21    }
22}