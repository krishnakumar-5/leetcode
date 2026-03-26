// Last updated: 3/26/2026, 9:24:04 AM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Stack<Integer> st=new Stack<>();
4        Queue<Integer> q=new LinkedList<>();
5        for(int i=0;i<students.length;i++){
6            q.add(students[i]);
7        }
8        for(int i=sandwiches.length-1;i>=0;i--){
9            st.push(sandwiches[i]);
10        }
11        int rej=0;
12        while(!st.isEmpty()&&!q.isEmpty()){
13            if(st.peek()==q.peek()){
14                st.pop();
15                q.remove();
16                rej=0;
17            }else{
18                q.add(q.remove());
19                rej++;
20                if(rej==q.size()){
21                    return q.size();
22                }
23            }
24        }
25        return q.size();
26    }
27}