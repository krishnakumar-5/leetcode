// Last updated: 4/5/2026, 7:16:08 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=nums[0];
4        int res=nums[0];
5        for(int i=1;i<nums.length;i++){
6            max=Math.max(max+nums[i],nums[i]);
7            res=Math.max(res,max);
8        }
9        return res;
10    }
11}