// Last updated: 6/4/2026, 5:11:36 PM
1class Solution {
2    public boolean vowels(char k){
3        if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'){
4            return true;
5        }
6        return false;
7    }
8    public int maxVowels(String s, int k) {
9        int max=Integer.MIN_VALUE;
10        int vc=0;
11        for(int i=0;i<s.length();i++){
12            if(vowels(s.charAt(i))){
13                vc++;
14            }
15            if(i>=k){
16                if(vowels(s.charAt(i-k))){
17                    vc--;
18                }
19            }
20            max=Math.max(max,vc);
21        }
22        return max;
23    }
24}