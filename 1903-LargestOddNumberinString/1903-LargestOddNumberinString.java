// Last updated: 7/10/2026, 6:14:37 PM
1class Solution {
2    public int maxProductDifference(int[] nums) {
3        Arrays.sort(nums);
4        if(nums.length<4){
5            return 0;
6        }
7        int res=(nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
8        return res;
9    }
10}