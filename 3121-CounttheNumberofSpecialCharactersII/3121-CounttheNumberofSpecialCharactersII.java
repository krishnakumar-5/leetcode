// Last updated: 5/27/2026, 4:09:05 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        Set<Character> set = new HashSet<>();
4        StringBuilder sb = new StringBuilder();
5
6        for (char k : word.toCharArray()) {
7            if (set.add(k)) {
8                sb.append(k);
9            }
10        }
11
12        char[] ch = sb.toString().toCharArray();
13
14        int c = 0;
15
16        for (char k : ch) {
17
18            if (Character.isLowerCase(k)) {
19
20                int lastLower = word.lastIndexOf(k);
21                int firstUpper = word.indexOf(Character.toUpperCase(k));
22
23                if (firstUpper != -1 && lastLower < firstUpper) {
24                    c++;
25                }
26            }
27        }
28
29        return c;
30    }
31}