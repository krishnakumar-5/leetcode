// Last updated: 3/16/2026, 2:00:37 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String,List<String>> map=new LinkedHashMap<>();
4        for(String s:strs){
5            char[] k=s.toCharArray();
6            Arrays.sort(k);
7            String key=new String(k);
8            if(!map.containsKey(key)){
9                map.put(key,new ArrayList<>());
10            }
11            map.get(key).add(s);
12        }
13        return new ArrayList<>(map.values());
14    }
15}