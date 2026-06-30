// Last updated: 6/30/2026, 6:14:32 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String str=s.trim();
4        int i=str.length()-1;
5        int c=0;
6        while(i>=0&&str.charAt(i)!=' '){
7            i--;
8            c++;
9        }
10        return c;
11        
12    }
13}