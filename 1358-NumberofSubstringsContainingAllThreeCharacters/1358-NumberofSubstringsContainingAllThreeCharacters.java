// Last updated: 6/30/2026, 6:05:52 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3
4        int[] freq = new int[3];
5
6        int left = 0;
7        int ans = 0;
8
9        for (int right = 0; right < s.length(); right++) {
10
11            freq[s.charAt(right) - 'a']++;
12
13            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
14
15                ans += s.length() - right;
16
17                freq[s.charAt(left) - 'a']--;
18
19                left++;
20            }
21        }
22
23        return ans;
24    }
25}