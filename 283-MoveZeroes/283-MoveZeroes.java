// Last updated: 4/5/2026, 7:18:06 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int insertPos = 0;
4
5        for (int num : nums)
6            if (num != 0)
7                nums[insertPos++] = num;
8
9        while (insertPos < nums.length)
10            nums[insertPos++] = 0;
11    }
12}