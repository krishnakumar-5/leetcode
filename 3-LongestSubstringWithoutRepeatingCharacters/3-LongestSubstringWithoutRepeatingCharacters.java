// Last updated: 3/16/2026, 2:40:32 PM
1class Solution {
2    public int romanToInt(String s) {
3        int arr[]=new int[26];
4        arr['I'-'A']=1;
5        arr['V'-'A']=5;
6        arr['X'-'A']=10;
7        arr['L'-'A']=50;
8        arr['C'-'A']=100;
9        arr['D'-'A']=500;
10        arr['M'-'A']=1000;
11        char ch[]=s.toCharArray();
12        int res=0;
13        for(int i=0;i<s.length();i++){
14            if(i!=s.length()-1&&arr[ch[i]-'A']<arr[ch[i+1]-'A']){
15                res+=arr[ch[i+1]-'A']-arr[ch[i]-'A'];
16                i++;
17            }else{
18                res+=arr[ch[i]-'A'];
19            }
20        }
21        return res;
22    }
23}