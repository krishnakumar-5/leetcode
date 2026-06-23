// Last updated: 6/23/2026, 11:09:03 AM
1class Solution {
2    public String reverseStr(String s, int k) {
3        int d=2*k;
4        int l=0,r=d;
5        if(k==1){
6            return s;
7        }
8        if(s.length()<k){
9            StringBuilder sb=new StringBuilder(s);
10            return sb.reverse().toString();
11        }
12        StringBuilder res=new StringBuilder();
13        while(r<=s.length()){
14            String str=s.substring(l,r);
15            String s1=s.substring(l,((l+r)/2));
16            String s2=s.substring((l+r)/2,r);
17            StringBuilder sb=new StringBuilder(s1);
18            sb.reverse();
19            sb.append(s2);
20            res.append(sb);
21            l=r;
22            r+=d;
23        }
24        if(s.length()-l>=k&&s.length()-l<d){
25            String s3=s.substring(l,s.length());
26            String s4=s.substring(l,l+k);
27            String s5=s.substring(l+k,s.length());
28            StringBuilder sb1=new StringBuilder(s4);
29            sb1.reverse();
30            sb1.append(s5);
31            res.append(sb1);
32        }else{
33            String s6=s.substring(l,s.length());
34            StringBuilder sb2=new StringBuilder(s6);
35            sb2.reverse();
36            res.append(sb2);
37        }
38        return res.toString();
39
40    }
41}