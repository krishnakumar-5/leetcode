// Last updated: 4/10/2026, 7:46:38 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int totalSum = 0;
4        int leftsum = 0;
5        for (int ele : nums)
6            totalSum += ele;
7        for (int i = 0; i < nums.length; leftsum += nums[i++])
8            if (leftsum * 2 == totalSum - nums[i])
9                return i;       
10        return -1;      
11    }   
12}