// Last updated: 3/10/2026, 11:11:40 AM
1class Solution {
2    public static int gcd(int a,int b){
3        if(b==0){
4            return a;
5        }
6        return gcd(b,a%b);
7    }
8    public int minOperations(int[] nums, int[] numsDivide) {
9        Arrays.sort(nums);
10        int g=numsDivide[0];
11        for(int i=1;i<numsDivide.length;i++){
12            g=gcd(g,numsDivide[i]);
13        }
14        for(int i=0;i<nums.length;i++){
15            if(g%nums[i]==0){
16                return i;
17            }
18        }
19        return -1;
20    }
21}