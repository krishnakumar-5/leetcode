// Last updated: 6/21/2026, 12:51:12 PM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int sum=0,c=0;
5        for(int i=0;i<costs.length;i++){
6            if(sum+costs[i]<=coins){
7                sum+=costs[i];
8                c++;
9            }else{
10                if(c==1)
11                    return 0;
12                return c;
13            }
14        }
15        return c;
16    }
17}