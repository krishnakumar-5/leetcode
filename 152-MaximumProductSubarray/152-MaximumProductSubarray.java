// Last updated: 3/7/2026, 4:14:15 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int minpro=nums[0];
5        int maxpro=nums[0];
6        int ans=nums[0];
7        int c1,c2;
8        for(int i=1;i<n;i++){
9            c1=minpro*nums[i];
10            c2=maxpro*nums[i];
11            minpro=Math.min(nums[i],Math.min(c1,c2));
12            maxpro=Math.max(nums[i],Math.max(c1,c2));
13            ans=Math.max(ans,maxpro);
14        }
15        return ans;
16    }
17}