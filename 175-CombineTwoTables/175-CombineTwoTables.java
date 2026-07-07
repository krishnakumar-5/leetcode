// Last updated: 7/7/2026, 9:10:24 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];
6            nums[i]=sum;
7        }
8        return nums;
9    }
10}