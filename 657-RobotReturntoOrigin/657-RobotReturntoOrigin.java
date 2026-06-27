// Last updated: 6/27/2026, 1:49:16 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int l=0,r=0,u=0,d=0;
4        for(int i=0;i<moves.length();i++){
5            char k=moves.charAt(i);
6            if(k=='U'){
7                u++;
8            }if(k=='D'){
9                d--;    
10            }if(k=='L'){
11                l--;
12            }if(k=='R'){
13                r++;
14            }
15        }if(r+l==0&&u+d==0){
16            return true;
17        }
18        return false;
19    }
20}