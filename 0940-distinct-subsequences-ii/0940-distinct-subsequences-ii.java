class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;

        long total = 0;
        long[] last = new long[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            long newSubseq = (total + 1) % MOD;

            total = (total + newSubseq - last[index] + MOD) % MOD;

            last[index] = newSubseq;
        }

        return (int) total;
    }
}