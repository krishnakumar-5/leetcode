class Solution {
    public boolean isGoodArray(int[] nums) {
        int Gcd = nums[0];
        for (int num : nums) {
            Gcd = Gcd(Gcd, num);
            if (Gcd == 1) {
                return true;
            }
        }
        return false;
    }
    public int Gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}