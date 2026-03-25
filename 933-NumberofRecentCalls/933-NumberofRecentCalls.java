// Last updated: 3/25/2026, 6:58:18 PM
1class RecentCounter {
2    Stack<Integer> stack = new Stack<>();
3
4    public RecentCounter() {
5        
6    }
7
8    public int ping(int t) {
9        int c = t - 3000;
10        stack.push(t);
11
12        while (!stack.isEmpty() && stack.get(0) < c) {
13            stack.remove(0);   
14        }
15
16        return stack.size();
17    }
18}