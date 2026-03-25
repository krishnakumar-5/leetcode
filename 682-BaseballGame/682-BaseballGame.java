// Last updated: 3/25/2026, 8:36:14 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> stack=new Stack<>();
4        for(String str:operations){
5            if(!str.equals("+")&&!str.equals("D")&&!str.equals("C")){
6                stack.push(Integer.parseInt(str));
7            }else{
8                switch(str){
9                    case "+": 
10                        int a=stack.pop();
11                        int b=stack.pop();
12                        stack.push(b);
13                        stack.push(a);
14                        stack.push(a+b);
15                        break;
16                    case "D":
17                        int c=stack.pop();
18                        stack.push(c);
19                        stack.push(c*2);
20                        break;
21                    case "C":
22                        stack.pop();
23                        break;
24                }
25            }
26        }
27        if(stack.isEmpty()){
28            return 0;
29        }
30        int sum=0;
31        while(!stack.isEmpty()){
32            sum+=stack.pop();
33        }
34        return sum;
35    }
36}