class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        // Iterate through each place value (1, 10, 100, 1000, etc.)
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            
            // Number of complete groups of 'divider' size
            count += (n / divider) * i;
            
            // Handle the remainder parts for the current position
            long remainder = n % divider;
            if (remainder >= i) {
                count += Math.min(remainder - i + 1, i);
            }
        }
        return count;

    }
}