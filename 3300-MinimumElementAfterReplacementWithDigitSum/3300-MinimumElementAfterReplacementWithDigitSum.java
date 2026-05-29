// Last updated: 5/29/2026, 2:24:38 PM
1class Solution {
2    public int minElement(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            int k=0;
6            while(nums[i]!=0){
7                int d=nums[i]%10;
8                k+=d;
9                nums[i]/=10;
10            }
11            nums[i]=k;
12            if(min>nums[i]){
13                min=nums[i];
14            }
15        }
16        return min;
17        
18    }
19}