// Last updated: 7/1/2026, 9:33:16 PM
1class Solution {
2    public List<String> removeAnagrams(String[] words) {
3        LinkedList<String> l = new LinkedList<>();
4        String prev = "";
5
6        for (int i = 0; i < words.length; i++) {
7            char arr[] = words[i].toCharArray();
8            Arrays.sort(arr);
9            String res = new String(arr);
10
11            if (!res.equals(prev)) {
12                l.add(words[i]);
13                prev = res;
14            }
15        }
16
17        return l;
18    }
19}