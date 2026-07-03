// Last updated: 7/3/2026, 5:52:27 PM
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        Set<String> set=new LinkedHashSet<>();
4        String a[]=s1.split(" ");
5        String []b=s2.split(" ");
6        Map<String,Integer> map=new HashMap<>();
7        for(int i=0;i<a.length;i++){
8            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
9        }
10        for(int i=0;i<b.length;i++){
11            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
12        }
13        for (Map.Entry<String, Integer> entry : map.entrySet()) {
14            if(entry.getValue()==1){
15                set.add(entry.getKey());
16            }
17        }
18        String[] array = set.toArray(new String[0]);
19        return array; 
20
21    }
22}