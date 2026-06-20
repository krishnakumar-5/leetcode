// Last updated: 6/20/2026, 3:44:06 PM
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> l=new LinkedList<>();
4        for(int i=1;i<=n;i++){
5            if(i%3==0&&i%5==0){
6                l.add("FizzBuzz");
7            }else if(i%3==0){
8                l.add("Fizz");
9            }else if(i%5==0){
10                l.add("Buzz");
11            }else{
12                l.add(String.valueOf(i));
13            }
14        }
15        return l;
16    }
17}