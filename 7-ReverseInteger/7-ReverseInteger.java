// Last updated: 6/26/2026, 7:22:10 PM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4
5        while (x != 0) {
6            int digit = x % 10;
7            x /= 10;
8
9            // check before overflow happens
10            if (rev > 214748364 || (rev == 214748364 && digit > 7))
11                return 0;
12            if (rev < -214748364 || (rev == -214748364 && digit < -8))
13                return 0;
14
15            rev = rev * 10 + digit;
16        }
17        return rev;
18    }
19}