// Last updated: 4/12/2026, 3:14:35 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int r=mat.length;
4        int p=0,s=0,k=r;
5        for(int i=0;i<r;i++){
6            p+=mat[i][i];
7            s+=mat[i][--k];
8        }
9        if(r%2!=0){
10            return p+s-mat[r/2][r/2];
11        }
12        return p+s;
13    }
14}