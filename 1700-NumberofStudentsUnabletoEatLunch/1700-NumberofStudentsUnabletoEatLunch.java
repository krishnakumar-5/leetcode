// Last updated: 3/26/2026, 11:41:13 AM
1class Solution {
2    public List<List<String>> res=new ArrayList<>();
3    public List<List<String>> solveNQueens(int n) {
4        char[][] board=new char[n][n];
5        for(int i=0;i<n;i++){
6            Arrays.fill(board[i],'.');
7        }
8        backtrack(board,0);
9        return res;
10    }
11    public void backtrack(char[][] board,int row){
12        if(row==board.length){
13            ArrayList<String> l=new ArrayList<>();
14            for(int i=0;i<board.length;i++){
15                l.add(new String(board[i]));
16            }
17            res.add(l);
18            return;
19        }
20        for(int col=0;col<board[row].length;col++){
21            if(isSafe(board,row,col)){
22                board[row][col]='Q';
23                backtrack(board,row+1);
24                board[row][col]='.';
25            }
26        }
27        
28    }
29    public  boolean isSafe(char[][] board,int row,int col){
30        for(int i=0;i<row;i++){
31            if(board[i][col]=='Q'){
32                return false;
33            }
34            for(int j=0;j<board[row].length;j++){
35                if(board[i][j]=='Q'){
36                    if(Math.abs(row-i)==Math.abs(col-j)){
37                        return false;
38                    }
39                    break;
40                }
41            }
42        }
43        return true;
44    }
45}