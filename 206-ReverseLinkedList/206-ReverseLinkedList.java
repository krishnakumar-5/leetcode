// Last updated: 3/23/2026, 2:01:55 PM
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
12    public ListNode reverseList(ListNode head) {
13            ListNode cur=head;
14            ListNode prev=null;
15            ListNode next=null;
16            while(cur!=null){
17                next=cur.next;
18                cur.next=prev;
19                prev=cur;
20                cur=next;
21            }
22            return prev;
23              
24    }
25}