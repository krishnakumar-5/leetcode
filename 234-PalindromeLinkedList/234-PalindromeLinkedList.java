// Last updated: 3/23/2026, 2:39:38 PM
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
21        slow.next=null;
22        ListNode prev=null;
23        ListNode cur=secondhalf;
24        ListNode next=null;
25        while(cur!=null){
26            next=cur.next;
27            cur.next=prev;
28            prev=cur;
29            cur=next;
30        }
31        while(firsthalf!=null&&prev!=null){
32            if(firsthalf.val!=prev.val){
33                return false;
34            }
35            firsthalf=firsthalf.next;
36            prev=prev.next;
37        }
38        return true;
39
40    }
41}