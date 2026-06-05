// Last updated: 6/5/2026, 9:42:54 PM
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
12        int[] ans = new int[n];
13
14        temp = head;
15        int i = 0;
16
17        while (temp != null) {
18
19            ListNode next = temp.next;
20
21            while (next != null && next.val <= temp.val) {
22                next = next.next;
23            }
24
25            ans[i++] = (next == null) ? 0 : next.val;
26
27            temp = temp.next;
28        }
29
30        return ans;
31    }
32}