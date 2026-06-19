// Last updated: 6/19/2026, 4:21:58 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int c=0,p=0,i=0;
4        for(int j=0;j<s.length();j++){
5            char k=s.charAt(j);
6            for(i=p;i<t.length();i++){
7                if(k==t.charAt(i)){
8                    c++;
9                    p=i+1;
10                    break;
11                }
12            }
13        }
14        if(c==s.length()){
15            return true;
16        }
17        return false;
18    }
19}