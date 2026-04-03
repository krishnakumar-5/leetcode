// Last updated: 4/3/2026, 7:03:49 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int l=0;
4        int r=1;
5        int res[]=new int[2];
6        while(l!=nums.length){
7            if(nums[l]+nums[r]==target&&l!=r){
8                res[0]=l;
9                res[1]=r;
10                return res;
11            }
12            r++;
13            if(r==nums.length){
14                r=0;
15                l++;
16            }
17        }
18        return res;
19        
20    }
21}