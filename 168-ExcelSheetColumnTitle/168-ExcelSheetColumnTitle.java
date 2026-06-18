// Last updated: 6/18/2026, 11:51:02 AM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder res=new StringBuilder();
4        while(columnNumber>0){
5            columnNumber--;
6            res.append((char)('A'+(columnNumber%26)));
7            columnNumber/=26;
8        }
9        return res.reverse().toString();
10    }
11}