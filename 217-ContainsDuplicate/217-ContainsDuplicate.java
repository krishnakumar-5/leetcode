// Last updated: 6/2/2026, 8:48:23 PM
1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer> set = new HashSet<>();
4
5        while (n != 1 && !set.contains(n)) {
6            set.add(n);
7
8            int sum = 0;
9            while (n != 0) {
10                int digit = n % 10;
11                sum += digit * digit;
12                n /= 10;
13            }
14
15            n = sum;
16        }
17
18        return n == 1;
19    }
20}