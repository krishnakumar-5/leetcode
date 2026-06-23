// Last updated: 6/23/2026, 1:49:08 PM
1class Solution {
2    public int findLUSlength(String a, String b) {
3        if(a.equals(b)) return -1;
4        return (int)Math.max(b.length(),a.length());
5    }
6}