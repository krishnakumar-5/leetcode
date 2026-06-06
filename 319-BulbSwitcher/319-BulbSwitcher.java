// Last updated: 6/6/2026, 2:29:11 PM
1class Solution {
2    public int maxSum(int[][] grid) {
3        int max=Integer.MIN_VALUE;
4        for(int i=0;i<grid.length-2;i++){
5            for(int j=0;j<grid[0].length-2;j++){
6                int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
7                max=Math.max(max,sum);
8            }
9        }
10        return max;
11    }
12}