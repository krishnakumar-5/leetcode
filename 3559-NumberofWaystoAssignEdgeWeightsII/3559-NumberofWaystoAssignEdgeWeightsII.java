// Last updated: 7/2/2026, 11:16:33 AM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int c=0;
4        for(int i=left;i<=right;i++){
5            String str=Integer.toBinaryString(i);
6            int res=0;
7            for(int j=0;j<str.length();j++){
8                if(str.charAt(j)=='1'){
9                    res++;
10                }
11            }
12            if(res==3||res==2||res==5||res==7||res==11||res==13||res==17||res==19){
13                c++;
14            }
15        }
16        return c;
17    }
18}