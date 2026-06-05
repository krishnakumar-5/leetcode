// Last updated: 6/5/2026, 9:40:52 PM
1class Solution {
2    public int[] nextLargerNodes(ListNode head) {
3
4        List<Integer> list = new ArrayList<>();
5
6        while (head != null) {
7            list.add(head.val);
8            head = head.next;
9        }
10
11        int n = list.size();
12        int[] ans = new int[n];
13
14        Stack<Integer> st = new Stack<>();
15
16        for (int i = 0; i < n; i++) {
17
18            while (!st.isEmpty() &&
19                   list.get(i) > list.get(st.peek())) {
20
21                ans[st.pop()] = list.get(i);
22            }
23
24            st.push(i);
25        }
26
27        return ans;
28    }
29}