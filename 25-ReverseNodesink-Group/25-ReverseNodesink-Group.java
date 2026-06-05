// Last updated: 6/5/2026, 9:34:13 AM
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
12   public static ListNode mergeKLists(ListNode[] lists){
13    return partion(lists,0,lists.length-1);
14}
15
16public static ListNode partion(ListNode[] lists,int s,int e){
17    if(s==e)  return lists[s];
18    if(s<e){
19        int q=(s+e)/2;
20        ListNode l1=partion(lists,s,q);
21        ListNode l2=partion(lists,q+1,e);
22        return merge(l1,l2);
23    }else
24        return null;
25}
26
27public static ListNode merge(ListNode l1,ListNode l2){
28    if(l1==null) return l2;
29    if(l2==null) return l1;
30    if(l1.val<l2.val){
31        l1.next=merge(l1.next,l2);
32        return l1;
33    }else{
34        l2.next=merge(l1,l2.next);
35        return l2;
36    }
37}
38}