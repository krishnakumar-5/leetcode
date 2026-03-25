// Last updated: 3/25/2026, 8:28:15 PM
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
15                        System.out.println(stack);
16                        break;
17                    case "D":
18                        int c=stack.pop();
19                        stack.push(c);
20                        stack.push(c*2);
21                        System.out.println(stack);
22                        break;
23                    case "C":
24                        stack.pop();
25                        System.out.println(stack);
26                        break;
27                }
28            }
29        }
30        if(stack.isEmpty()){
31            return 0;
32        }
33        int sum=0;
34        while(!stack.isEmpty()){
35            sum+=stack.pop();
36        }
37        return sum;
38    }
39}