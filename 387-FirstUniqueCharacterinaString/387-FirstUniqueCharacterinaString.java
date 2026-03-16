// Last updated: 3/16/2026, 1:41:36 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        Map<Character,Integer> map=new LinkedHashMap<>();
4        for(char ch:s.toCharArray()){
5            map.put(ch,map.getOrDefault(ch,0)+1);
6        }
7        for(int i=0;i<s.length();i++){
8            if(map.get(s.charAt(i))==1){
9                return i;
10            }
11        }
12        return -1;
13       
14    }
15}