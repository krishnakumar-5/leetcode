// Last updated: 6/2/2026, 6:08:49 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int r=grid.length;
4        int c=grid[0].length;
5        for(int i=0;i<r;i++){
6            for(int j=0;j<c;j++){
7                if(i==0||j==0){
8                    if(i==0&&j==0){
9                         grid[i][j]=grid[i][j];
10                    }else if(i==0){
11                        grid[i][j]+=grid[i][j-1];
12                    }else if(j==0){
13                         grid[i][j]+=grid[i-1][j];
14                    }
15                }else{
16                   grid[i][j]=Math.min(grid[i-1][j]+grid[i][j],grid[i][j-1]+grid[i][j]);
17
18                }
19            }
20        }
21        return grid[r-1][c-1];
22    
23    }
24}