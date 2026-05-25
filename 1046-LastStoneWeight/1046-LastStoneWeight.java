// Last updated: 5/25/2026, 4:06:14 PM
1import java.util.*;
2class Solution {
3    public int lastStoneWeight(int[] stones) {
4       PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
5       for(int stone:stones){
6        q.offer(stone);
7       } 
8       while(q.size()>1){
9        int y=q.poll();
10        int x=q.poll();
11        if(y!=x){
12            q.offer(y-x);
13        }
14       }
15       return q.isEmpty()?0:q.peek();
16    }
17}