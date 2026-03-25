// Last updated: 3/25/2026, 7:00:03 PM
1class RecentCounter {
2    Queue<Integer> q = new LinkedList<>();
3
4    public RecentCounter() {
5        
6    }
7    
8    public int ping(int t) {
9        q.add(t);
10
11        while (!q.isEmpty() && q.peek() < t - 3000) {
12            q.poll();
13        }
14
15        return q.size();
16    }
17}