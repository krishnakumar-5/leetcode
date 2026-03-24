// Last updated: 3/24/2026, 10:13:17 PM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        if (head == null || head.next == null) return head;
4
5        ListNode prev = null;
6        ListNode cur = head;
7        ListNode first = head;
8        ListNode res = null;
9        boolean firstGroup = true;
10
11        while (true) {
12            ListNode check = cur;
13            for (int i = 0; i < k; i++) {
14                if (check == null) return res == null ? head : res;
15                check = check.next;
16            }
17
18            prev = null;
19            ListNode temp = cur;
20            for (int i = 0; i < k; i++) {
21                ListNode next = cur.next;
22                cur.next = prev;
23                prev = cur;
24                cur = next;
25            }
26
27            if (firstGroup) {
28                res = prev;
29                firstGroup = false;
30            } else {
31                first.next = prev;
32            }
33            temp.next = cur;
34            first = temp;
35        }
36    }
37}