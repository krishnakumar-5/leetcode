// Last updated: 6/5/2026, 9:41:56 PM
1class Solution {
2    public int[] nextLargerNodes(ListNode head) {
3
4        int n = 0;
5        ListNode temp = head;
6
7        while (temp != null) {
8            n++;
9            temp = temp.next;
10        }
11
12        int[] values = new int[n];
13        temp = head;
14
15        for (int i = 0; i < n; i++) {
16            values[i] = temp.val;
17            temp = temp.next;
18        }
19
20        int[] ans = new int[n];
21        Stack<Integer> st = new Stack<>();
22
23        for (int i = 0; i < n; i++) {
24
25            while (!st.isEmpty() && values[i] > values[st.peek()]) {
26                ans[st.pop()] = values[i];
27            }
28
29            st.push(i);
30        }
31
32        return ans;
33    }
34}