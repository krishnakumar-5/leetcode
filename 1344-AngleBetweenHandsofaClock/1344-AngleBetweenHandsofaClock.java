// Last updated: 6/18/2026, 9:32:02 AM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double hours=30*hour;
4        double min=5.5*minutes;
5        double res=Math.abs(hours-min);
6        if(res>180){
7            res=360-res;
8        }
9        return res;
10    }
11}