// Last updated: 3/25/2026, 6:55:30 PM
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
12        // ✅ Remove outdated elements from bottom
13        while (!stack.isEmpty() && stack.firstElement() < c) {
14            stack.remove(0);   // remove oldest
15        }
16
17        // Now all elements are within range
18        return stack.size();
19    }
20}