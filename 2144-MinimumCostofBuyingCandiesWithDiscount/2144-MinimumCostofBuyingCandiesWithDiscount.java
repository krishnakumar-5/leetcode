// Last updated: 6/1/2026, 4:04:55 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int n=cost.length;
5        int c=0,sum=0;
6        for(int i=n-1;i>=0;i--){
7            sum+=cost[i];
8            c++;
9            if(c==2){
10                c=0;
11                i--;
12            }
13        }
14        return sum;
15    }
16}