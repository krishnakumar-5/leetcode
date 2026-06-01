// Last updated: 6/1/2026, 8:48:20 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int dp[] = new int[n];
5        Arrays.fill(dp,1);
6        for(int i=1;i<n;i++){
7            for(int j=0;j<i;j++){
8                if(nums[j]<nums[i]){
9                    dp[i] = Math.max(dp[i],dp[j]+1);
10                }
11            }
12        }   
13        int max = 0;
14        for(int i=0;i<n;i++){
15            max = Math.max(max,dp[i]);
16        }
17        return max;
18    }
19}