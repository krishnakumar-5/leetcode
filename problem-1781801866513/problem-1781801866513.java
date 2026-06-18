// Last updated: 6/18/2026, 10:27:46 PM
1class Solution {
2    public String[] findWords(String[] words) {
3        String f="qwertyuiopQWERTYUIOP";
4        String s="asdfghjklASDFGHJKL";
5        String t="zxcvbnmZXCVBNM";
6        LinkedList<String> li=new LinkedList<>();
7        for(int i=0;i<words.length;i++){
8            String k=words[i];
9            char g=k.charAt(0);
10            String check="";
11            if(f.indexOf(g)!=-1){
12                check=f;
13            }else if(s.indexOf(g)!=-1){
14                check=s;
15            }else{
16                check=t;
17            }
18            boolean flag=true;
19            for(int j=1;j<k.length();j++){
20                if(check.indexOf(k.charAt(j))!=-1){
21                    continue;
22                }else{
23                    flag=false;
24                    break;
25                }
26            }
27            if(flag){
28                li.add(k);
29            }
30        }
31        String []res=new String[li.size()];
32        for(int i=0;i<res.length;i++){
33            res[i]=li.get(i);
34        }
35        return res;
36    }
37}