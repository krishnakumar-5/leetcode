// Last updated: 3/23/2026, 2:46:16 PM
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
16            slow=slow.next;
17            fast=fast.next.next;
18        }
19        ListNode firsthalf=head;
20        ListNode secondhalf=slow.next;
21        ListNode prev=null;
22        ListNode cur=secondhalf;
23        ListNode next=null;
24        while(cur!=null){
25            next=cur.next;
26            cur.next=prev;
27            prev=cur;
28            cur=next;
29        }
30        while(prev!=null){
31            if(firsthalf.val!=prev.val)
32                return false;
33            firsthalf=firsthalf.next;
34            prev=prev.next;
35        }
36        return true;
37
38    }
39}