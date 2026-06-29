// Last updated: 6/29/2026, 5:05:19 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int c=0;
4        for(int i=0;i<patterns.length;i++){
5            if(word.contains(patterns[i])){
6                c++;
7            }
8        }
9        return c;
10    }
11}