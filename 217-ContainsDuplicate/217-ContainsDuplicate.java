// Last updated: 6/2/2026, 9:17:25 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4
5        for(int num : nums) {
6            set.add(num);
7        }
8
9        int longest = 0;
10
11        for(int num : set) {
12            if(!set.contains(num - 1)) { 
13                int curr = num;
14                int len = 1;
15
16                while(set.contains(curr + 1)) {
17                    curr++;
18                    len++;
19                }
20
21                longest = Math.max(longest, len);
22            }
23        }
24
25        return longest;
26    }
27}