// Last updated: 5/30/2026, 2:35:59 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int r=grid.length;
4        int c=grid[0].length;
5        int count=0;
6        for(int i=0;i<r;i++){
7            for(int j=0;j<c;j++){
8                if(grid[i][j]=='1'){
9                    count++;
10                    dfs(grid,i,j);
11                }
12            }
13        }
14        return count;
15    }
16    public void dfs(char[][]g,int i,int j){
17        if(i<0||j<0||i>=g.length||j>=g[0].length||g[i][j]=='0'){
18            return;
19        }
20        g[i][j]='0';
21        dfs(g,i+1,j);
22        dfs(g,i-1,j);
23        dfs(g,i,j+1);
24        dfs(g,i,j-1);
25    }
26}