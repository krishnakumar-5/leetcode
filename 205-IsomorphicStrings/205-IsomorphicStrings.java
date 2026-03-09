// Last updated: 3/9/2026, 10:08:36 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3		int freq[]=new int[256];
4		int freq1[]=new int[256];
5		for(int i=0;i<s.length();i++) {
6			if(freq[s.charAt(i)]!=freq1[t.charAt(i)]) {
7				return false;
8			}
9		    freq[s.charAt(i)]=i+1;
10		    freq1[t.charAt(i)]=i+1;
11			
12		}
13        return true;
14    }
15}