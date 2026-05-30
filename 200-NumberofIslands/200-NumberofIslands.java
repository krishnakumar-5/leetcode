// Last updated: 5/30/2026, 2:52:50 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int a=(edges[0][0]);
4        int b=(edges[0][1]);
5        int res=0;
6        for(int i=0;i<edges.length;i++){
7            if(a==edges[i][0]||a==edges[i][1]){
8                res=a;
9            }
10            if(b==edges[i][0]||b==edges[i][1]){
11                res=b;
12            }
13            
14        }
15        return res;
16    }
17}