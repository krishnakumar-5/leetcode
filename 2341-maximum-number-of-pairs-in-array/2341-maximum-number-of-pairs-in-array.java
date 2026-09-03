class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        for (int x : nums) {
            ++cnt[x];
        }
        int y = 0;
        for (int x : cnt) {
            y += x / 2;
        }
        return new int[] {y, nums.length - y * 2};
    }
}