// Last updated: 6/27/2026, 2:02:51 PM
1class Solution {
2    public String toLowerCase(String s) {
3        StringBuilder sb=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            if((int)s.charAt(i)<=90&&Character.isLetter(s.charAt(i))){
6                sb.append((char)((int)s.charAt(i)+32));
7            }else{
8                sb.append(s.charAt(i));
9            }
10        }
11        return sb.toString();
12    }
13}