// Last updated: 6/16/2026, 9:54:08 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char k=s.charAt(i);
6            if(Character.isLetterOrDigit(k)){
7                sb.append(k);
8            }else if(k=='#'){
9                if(sb.length()!=0){
10                sb.append(sb);
11                }
12            }else if(k=='%'){
13                sb.reverse();
14            }else if(k=='*'){
15                if(sb.length()!=0){
16                sb.deleteCharAt(sb.length()-1);
17                }
18            }
19        }
20        return sb.toString();
21    }
22}