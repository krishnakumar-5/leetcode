// Last updated: 3/24/2026, 2:44:55 PM
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
12    public ListNode oddEvenList(ListNode head) {
13            if(head==null||head.next==null) 
14                return head;
15            ListNode odd=head;
16            ListNode even=head.next;
17            ListNode evenhead=even;
18            while(even!=null&&even.next!=null){
19                odd.next=odd.next.next;
20                odd=odd.next;
21                even.next=even.next.next;
22                even=even.next;
23                
24            }
25            odd.next=evenhead;
26            return head;
27        
28        
29    }
30}