// Last updated: 3/25/2026, 10:15:34 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if(head==null){
14            return head;
15        }
16        Node cur=head;
17        while(cur!=null){
18            if(cur.child!=null){
19                Node up=cur.next;
20                cur.next=flatten(cur.child);
21                cur.next.prev=cur;
22                cur.child=null;
23                while(cur.next!=null){
24                    cur=cur.next;
25                }
26                if(up!=null){
27                    cur.next=up;
28                    up.prev=cur;
29                }
30            }
31            cur=cur.next;
32        }
33        return head;
34    }
35}