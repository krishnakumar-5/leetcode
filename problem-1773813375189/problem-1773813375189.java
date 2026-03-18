// Last updated: 3/18/2026, 11:26:15 AM
1class MyStack {
2    Queue<Integer> q;
3    public MyStack() {
4        q=new LinkedList<>();
5    }
6    int k;
7    public void push(int x) {
8        q.offer(x);
9        k=q.size();
10        for(int i=1;i<k;i++){
11            int g=q.poll();
12            q.offer(g);
13        }
14    }
15    
16    public int pop() {
17        return q.poll();
18    }
19    
20    public int top() {
21        return q.peek();
22    }
23    
24    public boolean empty() {
25        if(!q.isEmpty()){
26            return false;
27        }
28        return true;
29    }
30}
31
32/**
33 * Your MyStack object will be instantiated and called as such:
34 * MyStack obj = new MyStack();
35 * obj.push(x);
36 * int param_2 = obj.pop();
37 * int param_3 = obj.top();
38 * boolean param_4 = obj.empty();
39 */