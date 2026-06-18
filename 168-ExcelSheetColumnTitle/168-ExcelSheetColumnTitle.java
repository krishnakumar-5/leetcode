// Last updated: 6/18/2026, 11:48:57 AM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        String res="";
4        while(columnNumber>0){
5            columnNumber--;
6            int d=columnNumber%26;
7            char r=(char)('A'+(d));
8            res=r+res;
9            columnNumber/=26;
10        }
11        return res;
12    }
13}