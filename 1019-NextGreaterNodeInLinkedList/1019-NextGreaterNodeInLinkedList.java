// Last updated: 6/5/2026, 9:43:19 PM
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
12        ListNode prev = null, curr = head, next;
13
14        while (curr != null) {
15            next = curr.next;
16            curr.next = prev;
17            prev = curr;
18            curr = next;
19        }
20
21        int[] ans = new int[n];
22        Stack<Integer> st = new Stack<>();
23
24        temp = prev;
25        int idx = n - 1;
26
27        while (temp != null) {
28
29            while (!st.isEmpty() && st.peek() <= temp.val) {
30                st.pop();
31            }
32
33            ans[idx] = st.isEmpty() ? 0 : st.peek();
34
35            st.push(temp.val);
36
37            idx--;
38            temp = temp.next;
39        }
40
41        return ans;
42    }
43}