// Last updated: 5/25/2026, 4:21:34 PM
1class Solution {
2    public String predictPartyVictory(String senate) {
3        Queue<Integer> radiant=new LinkedList<>();
4        Queue<Integer> dire =new LinkedList<>();
5        int n=senate.length();
6        for(int i=0;i<n;i++){
7            if(senate.charAt(i)=='R'){
8                radiant.offer(i);
9            }else{
10                dire.offer(i);
11            }
12        }
13        while(!radiant.isEmpty()&&!dire.isEmpty()){
14            int r=radiant.poll();
15            int d=dire.poll();
16            if(r<d){
17                radiant.offer(r+n);
18            }else{
19                dire.offer(d+n);
20            }
21        }
22        return radiant.isEmpty()?"Dire":"Radiant";
23
24    }
25}