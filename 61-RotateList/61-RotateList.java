// Last updated: 3/23/2026, 6:56:11 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null){
14            return null;
15        }
16        if(head.next==null){
17            return head;
18        }
19        ListNode t=head;
20        int c=0;
21        while(t!=null){
22            t=t.next;
23            c++;
24        }
25        k=k%c;
26        for(int i=0;i<k;i++){
27            ListNode temp=head;
28            while(temp.next.next!=null){
29                temp=temp.next;
30            }
31            temp.next.next=head;
32            head=temp.next;
33            temp.next=null;
34            
35        }
36         
37        return head;
38    }
39}