// Last updated: 6/22/2026, 4:20:03 PM
My java solution:

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & -n) == n;
    }
}