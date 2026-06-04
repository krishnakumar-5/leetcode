// Last updated: 6/4/2026, 6:14:16 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int ws=0;
4        int c=0;
5        for(int we=0;we<nums.length;we++){                                                                                                       if(nums[we]<k){
6            c++;
7            int pro=nums[we];
8            int i=we+1;
9            while(i<nums.length){
10                pro*=nums[i++];
11                if(pro<k){
12                    c++;
13                }else{
14                    break;
15                }
16            }
17         } 
18                                                                                       
19        }
20        return c;
21    }
22}