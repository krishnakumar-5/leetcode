// Last updated: 6/27/2026, 1:46:28 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int l=0,r=0,u=0,d=0;
4        for(int i=0;i<moves.length();i++){
5            if(moves.charAt(i)=='U'){
6                u++;
7            }else if(moves.charAt(i)=='D'){
8                d--;    
9            }else if(moves.charAt(i)=='L'){
10                l--;
11            }else{
12                r++;
13            }
14        }if(r+l==0&&u+d==0){
15            return true;
16        }
17        return false;
18    }
19}