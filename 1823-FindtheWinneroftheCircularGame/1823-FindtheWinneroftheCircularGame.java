// Last updated: 3/10/2026, 2:56:13 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        if(n==1)
4            return 1;
5        return((findTheWinner(n-1,k)+k-1)%n+1);
6    }
7}