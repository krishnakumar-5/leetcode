// Last updated: 3/17/2026, 12:07:03 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<String> st=new Stack<>();
4        for(int i=0;i<tokens.length;i++){
5            if(!tokens[i].equals("*")&&!tokens[i].equals("/")&&!tokens[i].equals("+")&&!tokens[i].equals("-")){
6                 st.push(tokens[i]);
7            }else{
8                int res=0;
9                int a=Integer.parseInt(st.pop());
10                int b=Integer.parseInt(st.pop());
11                if(tokens[i].equals("+")){
12                    res=a+b;
13                    st.push(String.valueOf(res));
14                }else if(tokens[i].equals("-")){
15                   res=b-a;
16                    st.push(String.valueOf(res)); 
17                }else if(tokens[i].equals("*")){
18                    res=a*b;
19                    st.push(String.valueOf(res));
20                }else if(tokens[i].equals("/")){
21                    res=b/a;
22                    st.push(String.valueOf(res));
23                }
24            }
25        }
26        return Integer.parseInt(st.pop());
27        
28    }
29}