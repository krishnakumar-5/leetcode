// Last updated: 6/15/2026, 12:27:19 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15        ListNode temp=null;
16        if(head==null||head.next==null)
17        {
18            return null;
19        }
20        while(fast!=null&&fast.next!=null)
21        {
22            temp=slow;
23            slow=slow.next;
24            fast=fast.next.next;
25        }
26        temp.next=slow.next;
27        return head; 
28    }
29}