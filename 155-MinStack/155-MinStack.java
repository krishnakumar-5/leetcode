// Last updated: 3/17/2026, 2:24:34 PM
1import java.util.*;
2class MinStack {
3    Stack<Integer> st;
4    Stack<Integer> minst;
5    public MinStack() {
6        st=new Stack<>();
7        minst=new Stack<>();
8        
9    }
10    
11    public void push(int val) {
12        st.push(val);
13        if(minst.isEmpty()||val<=minst.peek()){
14            minst.push(val);
15        }
16    }
17    
18    public void pop() {
19        int num=st.pop();
20            if(num==minst.peek()){
21                minst.pop();
22            }
23        
24    }
25    
26    public int top() {
27        if(!st.isEmpty())
28            return st.peek();
29        return 0;
30    }
31    public int getMin() {
32        return minst.peek();  
33    }
34}
35
36/**
37 * Your MinStack object will be instantiated and called as such:
38 * MinStack obj = new MinStack();
39 * obj.push(val);
40 * obj.pop();
41 * int param_3 = obj.top();
42 * int param_4 = obj.getMin();
43 */