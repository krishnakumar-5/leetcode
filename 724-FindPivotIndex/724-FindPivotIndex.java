// Last updated: 4/10/2026, 8:28:01 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3    int n = nums.length;
4    int[] result = new int[n];
5
6    result[0] = 1;
7    for (int i = 1; i < n; i++) {
8        result[i] = result[i - 1] * nums[i - 1];
9    }
10
11    int right = 1;
12    for (int i = n - 1; i >= 0; i--) {
13        result[i] = result[i] * right;
14        right *= nums[i];
15    }
16
17    return result;
18    }
19}