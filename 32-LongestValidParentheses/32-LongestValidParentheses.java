// Last updated: 3/17/2026, 11:23:36 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4        st.push(-1);
5        int maxlen=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='('){
8                st.push(i);
9            }else{
10                st.pop();
11                if(st.isEmpty()){
12                    st.push(i);
13                }else{
14                    maxlen=Math.max(maxlen,i-st.peek());
15                }
16            }
17        }
18        return maxlen;
19    }
20}