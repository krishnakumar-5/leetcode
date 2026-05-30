// Last updated: 5/30/2026, 2:46:25 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        Set<Integer> set=new HashSet<>();
4        set.add(edges[0][0]);
5        set.add(edges[0][1]);
6        int res=0;
7        for(int i=0;i<edges.length;i++){
8            for(int j=0;j<edges[0].length;j++){
9                if(set.contains(edges[i][j])){
10                    res=edges[i][j];
11                }
12            }
13        }
14        return res;
15    }
16}