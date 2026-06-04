// Last updated: 6/4/2026, 5:11:25 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int max=Integer.MIN_VALUE;
4        int vc=0;
5        String vow="aeiouAEIOU";
6        for(int i=0;i<s.length();i++){
7            if(vow.indexOf(s.charAt(i))!=-1){
8                vc++;
9            }
10            if(i>=k){
11                if(vow.indexOf(s.charAt(i-k))!=-1){
12                    vc--;
13                }
14            }
15            max=Math.max(max,vc);
16        }
17        return max;
18    }
19}