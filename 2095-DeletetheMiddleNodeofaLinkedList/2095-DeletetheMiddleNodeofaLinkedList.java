// Last updated: 6/15/2026, 12:21:27 PM
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
13        ListNode temp=head;
14        if(temp==null||temp.next==null){
15            return null;
16        }
17        int len=0;
18        while(temp!=null){
19            temp=temp.next;
20            len++;
21        }
22        ListNode temp1=head;
23        int k=0;
24        if(len%2!=0){
25            k=len-1;
26        }else{
27            k=len;
28        }
29        while(k!=0){
30            k--;
31            if(k==len/2){
32                temp1.next=temp1.next.next;
33                break;
34            }
35            temp1=temp1.next;
36        }
37        return head;
38    }
39}