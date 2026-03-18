// Last updated: 3/18/2026, 11:53:08 AM
1class MyQueue {
2    Stack<Integer> st;
3    Stack<Integer> st1;
4    public MyQueue() {
5        st=new Stack<>();
6        st1=new Stack<>();
7    }
8    
9    public void push(int x) {
10        while(!st.isEmpty()){
11            st1.push(st.pop());
12        }
13        st.push(x);
14        while(!st1.isEmpty()){
15            st.push(st1.pop());
16        }
17    }
18    
19    public int pop() {
20        return st.pop();
21        
22    }
23    
24    public int peek() {
25        return st.peek();
26        
27    }
28    
29    public boolean empty() {
30        if(st.isEmpty()){
31            return true;
32        }
33        return false;
34    }
35}
36
37/**
38 * Your MyQueue object will be instantiated and called as such:
39 * MyQueue obj = new MyQueue();
40 * obj.push(x);
41 * int param_2 = obj.pop();
42 * int param_3 = obj.peek();
43 * boolean param_4 = obj.empty();
44 */