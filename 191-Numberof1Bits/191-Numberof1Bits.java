// Last updated: 6/17/2026, 2:11:49 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int c=0;
4        while(n>0){
5            n=n&(n-1);
6            c++;
7        }
8        return c;
9    }
10}