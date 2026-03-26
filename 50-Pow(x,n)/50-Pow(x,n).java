// Last updated: 3/26/2026, 6:53:16 PM
1class Solution {
2    int co=0;
3    public void backtrack(char board[][],int r){
4        if(r==board.length){
5            co++;
6            return;
7        }
8        for(int col=0;col<board.length;col++){
9            if(isSafe(board,r,col)){
10                board[r][col]='Q';
11                backtrack(board,r+1);
12                board[r][col]='.';
13            }
14        }
15        
16    }
17    public boolean isSafe(char board[][],int r,int c){
18        for(int i=0;i<r;i++){
19            if(board[i][c]=='Q'){
20                return false;
21            }
22            for(int j=0;j<board[r].length;j++){
23                if(board[i][j]=='Q'){
24                    if(Math.abs(r-i)==Math.abs(c-j)){
25                        return false;
26                    }
27                    break;
28                }
29            }
30        }
31        return true;
32    }
33    public int totalNQueens(int n) {
34        char board[][]=new char[n][n];
35        for(int i=0;i<n;i++){
36            Arrays.fill(board[i],'.');
37        }
38        backtrack(board,0);
39        return co;
40    }
41}