// Last updated: 6/20/2026, 4:07:09 PM
1class Solution {
2    public int countSegments(String s) {
3        s=s.trim();
4        if(s.length()==0){
5            return 0;
6        }
7        String[] str=s.split("\\s+");
8        return str.length;
9    }
10}