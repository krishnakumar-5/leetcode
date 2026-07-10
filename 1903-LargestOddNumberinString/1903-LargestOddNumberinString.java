// Last updated: 7/10/2026, 6:16:01 PM
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int f=nums[0]*nums[1];
        int l=nums[nums.length-1]*nums[nums.length-2];
        return l-f;
    }
}