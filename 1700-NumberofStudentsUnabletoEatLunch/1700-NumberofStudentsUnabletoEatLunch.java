// Last updated: 3/26/2026, 12:00:24 PM
1class Solution {
2    public List<String> res=new ArrayList<>();
3    public List<String> generateParenthesis(int n) {
4        gen(0,0,"",n);
5        return res;
6    }
7    public void gen(int op,int cl,String s,int n){
8        if(s.length()==n*2){
9            res.add(s);
10            return;
11        }
12        if(op<n){ //Generate "("
13            gen(op+1,cl,s+"(",n);
14        }
15        if(cl<op){ //Generate ")"
16            gen(op,cl+1,s+")",n);
17        }
18    }
19}