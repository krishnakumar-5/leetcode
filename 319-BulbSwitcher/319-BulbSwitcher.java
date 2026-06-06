// Last updated: 6/6/2026, 2:37:19 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int r=matrix.length;
4        int c=matrix[0].length;
5        int res[][]=new int[c][r];
6        for(int i=0;i<c;i++){
7            for(int j=0;j<r;j++){
8                res[i][j]=matrix[j][i];
9            }
10        }
11        return res;
12    }
13}