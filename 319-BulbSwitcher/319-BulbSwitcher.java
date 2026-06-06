// Last updated: 6/6/2026, 2:29:40 PM
1class Solution {
2    public int maxSum(int[][] grid) {
3        int r=grid.length;
4        int c=grid[0].length;
5        int max=Integer.MIN_VALUE;
6        for(int i=0;i<r-2;i++){
7            for(int j=0;j<c-2;j++){
8                int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
9                max=Math.max(max,sum);
10            }
11        }
12        return max;
13    }
14}