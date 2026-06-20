// Last updated: 6/20/2026, 4:03:58 PM
1class Solution {
2    public int countSegments(String s) {
3        if(s.length()==0){
4            return 0;
5        }
6        String[] str=s.split("\\s+");
7        int c=0;
8        for(int i=0;i<str.length;i++){
9            if(str[i].length()!=0){
10                c++;
11            }
12        }
13        return c;
14    }
15}