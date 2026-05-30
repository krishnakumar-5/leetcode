// Last updated: 5/30/2026, 2:48:56 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int a=(edges[0][0]);
4        int b=(edges[0][1]);
5        int res=0;
6        for(int i=0;i<edges.length;i++){
7            for(int j=0;j<edges[0].length;j++){
8                if(a==(edges[i][j])||b==edges[i][j]){
9                    res=edges[i][j];
10                }
11            }
12        }
13        return res;
14    }
15}