// Last updated: 6/29/2026, 5:06:14 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int n=patterns.length;
4        int c=0;
5        for(int i=0;i<n;i++){
6            String k=patterns[i];
7            if(word.contains(k)){
8                c++;
9            }
10        }
11        return c;
12    }
13}