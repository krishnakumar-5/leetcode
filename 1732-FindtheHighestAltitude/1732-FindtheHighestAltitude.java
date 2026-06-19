// Last updated: 6/19/2026, 9:30:00 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max=gain[0];
4        int num=max;
5        for(int i=1;i<gain.length;i++){
6            num+=gain[i];
7            if(num>max){
8                max=num;
9            }
10        }
11        if(max>0){
12            return max;
13        }
14        return 0;
15    }
16}