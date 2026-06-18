// Last updated: 6/18/2026, 10:16:50 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int l=0,r=0;
4        int left[]=new int[nums.length];
5        for(int i=0;i<left.length;i++){
6            left[i]=l;
7            l=left[i]+nums[i];
8        }
9        int right[]=new int[nums.length];
10        for(int i=right.length-1;i>=0;i--){
11            right[i]=r;
12            r=right[i]+nums[i];
13        }
14        for(int i=0;i<nums.length;i++){
15            nums[i]=Math.abs(left[i]-right[i]);
16        }
17        return nums;
18    }
19}