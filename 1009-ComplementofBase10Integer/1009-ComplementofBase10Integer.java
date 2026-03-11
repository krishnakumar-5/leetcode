// Last updated: 3/11/2026, 12:08:54 PM
1class Solution {
2    public int bitwiseComplement(int n) {
3        String str=Integer.toBinaryString(n);
4        String res="";
5        for(int i=0;i<str.length();i++){
6            if(str.charAt(i)=='0'){
7                res+="1";
8            }else{
9                res+="0";
10            }
11        } 
12        return(Integer.parseInt(res,2));
13    }
14}