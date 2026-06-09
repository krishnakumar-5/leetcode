// Last updated: 6/9/2026, 8:55:13 PM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            max=Math.max(max,nums[i]);
6            min=Math.min(min,nums[i]);
7        }
8        long val=max-min;
9        return val*k;
10    }
11}