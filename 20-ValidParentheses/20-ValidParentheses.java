// Last updated: 3/17/2026, 11:25:30 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        boolean flag=false;
5        for(int i=0;i<s.length();i++){
6            char k=s.charAt(i);
7            if(k=='('||k=='{'||k=='['){
8                st.push(k);
9                flag=true;
10            }
11            else if((k==')'||k=='}'||k==']')&&flag){
12                if(!st.isEmpty())
13                {
14                if((int)st.peek()+1==(int)k||(int)st.peek()+2==(int)k){
15                    st.pop();
16                }else{
17                    return false;
18                }
19                }else{
20                    return false;
21                }
22            }else{
23                return false;
24            }
25
26        }
27        if(st.isEmpty()){
28            return true;
29        }
30        return false;
31    }
32}