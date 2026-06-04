// Last updated: 6/4/2026, 5:41:18 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        int ws=0;
5        int del=0;
6        for(int we=0;we<nums.length;we++){
7            if(nums[we]==0){
8                del++;
9            }
10            while(del>1){
11                if(nums[ws]==0){
12                    del--;
13                }
14                ws++;
15            }
16            max=Math.max(max,we-ws+1);
17        }
18        return max-1;
19    }
20}