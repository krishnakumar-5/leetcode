// Last updated: 3/23/2026, 12:04:29 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        if(list1==null&&list2==null)
14            return null;
15        else{
16            if(list1==null)
17                return list2;
18            else if(list2==null)
19                return list1;
20            else{
21                ListNode dum=new ListNode(0);
22                ListNode temp=dum;
23                ListNode c1=list1;
24                ListNode c2=list2;
25                while(c1!=null&&c2!=null){
26                    if(c1.val>c2.val){
27                        temp.next=c2;
28                        c2=c2.next;
29                    }else{
30                        temp.next=c1;
31                        c1=c1.next;
32                    }
33                    temp=temp.next;
34                }
35                if(c1!=null)
36                    temp.next=c1;
37                else
38                    temp.next=c2;
39                return dum.next;
40            }
41        }
42    }
43}