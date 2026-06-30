// Last updated: 6/30/2026, 6:10:23 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String str[]=s.trim().split(" ");
4        return str[str.length-1].length();
5    }
6}