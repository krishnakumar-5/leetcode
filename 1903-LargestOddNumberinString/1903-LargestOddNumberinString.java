// Last updated: 7/10/2026, 6:09:28 PM
1class Solution {
2    public String largestOddNumber(String num) {
3        if(Integer.parseInt(String.valueOf(num.charAt(num.length()-1)))%2!=0) return num;
4        StringBuilder res=new StringBuilder();
5        for(int i=num.length()-1;i>=0;i--){
6            int k=Integer.parseInt(String.valueOf(num.charAt(i)));
7            if(k%2!=0){
8                res.append(num.substring(0,i+1));
9                break;
10            }
11        }
12        return res.toString();
13    }
14}