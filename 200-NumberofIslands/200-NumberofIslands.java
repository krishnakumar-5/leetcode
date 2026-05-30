// Last updated: 5/30/2026, 3:02:58 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int a=edges[0][0];
4        int b=edges[0][1];
5        int c=edges[1][0];
6        int d=edges[1][1];
7        int ans=0;
8        if(a==c||a==d)
9            return a;
10        else
11            return b;
12    }
13}