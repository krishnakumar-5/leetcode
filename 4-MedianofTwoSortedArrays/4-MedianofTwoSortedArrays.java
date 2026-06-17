// Last updated: 6/17/2026, 2:28:11 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if(dividend==-2147483648&&divisor==-1){
4            return Integer.MAX_VALUE;
5        }
6        return dividend/divisor;
7    }
8}