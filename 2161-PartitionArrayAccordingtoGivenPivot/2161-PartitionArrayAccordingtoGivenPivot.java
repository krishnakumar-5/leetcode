// Last updated: 6/8/2026, 10:48:58 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int r=0;
4        int res[]=new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<pivot){
7                res[r++]=nums[i];
8            }
9        }
10        for(int i=0;i<nums.length;i++){
11            if(nums[i]==pivot){
12                res[r++]=nums[i];
13            }
14        }
15        for(int i=0;i<nums.length;i++){
16            if(nums[i]>pivot){
17                res[r++]=nums[i];
18            }
19        }
20        return res;
21       
22       
23    }
24}