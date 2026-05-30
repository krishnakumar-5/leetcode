// Last updated: 5/30/2026, 3:00:31 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int b[]=new int[1000000];
4        int res=0;
5        for(int i=0;i<edges.length;i++){ 
6           b[edges[i][0]]++;
7           b[edges[i][1]]++; 
8           if(b[edges[i][0]]==edges.length){
9               return edges[i][0];
10           }
11           if(b[edges[i][1]]==edges.length){
12                return edges[i][1];
13           } 
14        }
15        return res;
16    }
17}