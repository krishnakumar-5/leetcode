// Last updated: 7/1/2026, 6:21:27 PM
1class Solution {
2    public int unequalTriplets(int[] nums) {
3        if(nums.length<3){
4            return 0;
5        }
6        int c=0;
7        for(int i=0;i<nums.length;i++){
8            for(int j=i+1;j<nums.length;j++){
9                for(int k=j+1;k<nums.length;k++){
10                    if(nums[i]!=nums[j]&&nums[i]!=nums[k]&&nums[j]!=nums[k]){
11                        c++;
12                    }
13                }
14            }
15        }
16        return c;
17    }
18}