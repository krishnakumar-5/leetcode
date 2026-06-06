// Last updated: 6/6/2026, 3:45:13 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int r=matrix.length;
4        int c=matrix[0].length;
5        for(int i=0;i<r;i++){
6            for(int j=i+1;j<c;j++){
7            	    int temp=matrix[i][j];
8                matrix[i][j]=matrix[j][i];
9                matrix[j][i]=temp;
10            }
11        }
12        for(int i=0;i<r;i++){
13            int l=0;
14            int ri=r-1;
15            while(l<ri){
16                int temp=matrix[i][l];
17                matrix[i][l]=matrix[i][ri];
18                matrix[i][ri]=temp;
19                l++;
20                ri--;
21            }
22        }
23    }
24}