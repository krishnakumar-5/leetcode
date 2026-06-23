// Last updated: 6/23/2026, 12:10:57 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int l=0;
4        int r=2;
5        int c=0;
6        if(n==0) return true;
7        if(flowerbed.length==1){
8            if(flowerbed[0]==0)
9            return true;
10            return false;
11        }
12        if(flowerbed[0]==0&&flowerbed[1]==0){
13            c++;
14            flowerbed[0]=1;
15        }
16        if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
17            c++;
18            flowerbed[flowerbed.length-1]=1;
19        }
20        while(r<flowerbed.length){
21            if(flowerbed[l]==0&&flowerbed[r]==0&&flowerbed[l+1]==0){
22                c++;
23                flowerbed[l+1]=1;
24            }
25            l++;
26            r++;
27        }
28        if(c>=n)
29        return true;
30
31        return false;
32    }
33}