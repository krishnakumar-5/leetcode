// Last updated: 3/23/2026, 2:38:38 PM
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
32            System.out.print(firsthalf.val+" "+prev.val);
33            if(firsthalf.val!=prev.val){
34                return false;
35            }
36            firsthalf=firsthalf.next;
37            prev=prev.next;
38        }
39        return true;
40
41    }
42}