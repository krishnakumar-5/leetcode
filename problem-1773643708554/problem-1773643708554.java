// Last updated: 3/16/2026, 12:18:28 PM
1class Solution {
2    public String intToRoman(int num) {
3        Map<Integer,String> map=new LinkedHashMap<>();    
4        map.put(1000,"M");
5        map.put(900,"CM");
6        map.put(500,"D");
7        map.put(400,"CD");
8        map.put(100,"C");
9        map.put(90,"XC");
10        map.put(50,"L");
11        map.put(40,"XL");
12        map.put(10,"X");
13        map.put(9,"IX");
14        map.put(5,"V");
15        map.put(4,"IV");
16        map.put(1,"I");
17        StringBuilder res=new StringBuilder();
18        for(int key:map.keySet()){
19          while(num>=key){
20                res.append(map.get(key));
21                num-=key;
22          }
23        }
24        return res.toString();
25
26    }
27}