// Last updated: 7/3/2026, 5:56:21 PM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int n=operations.length;
4        int res=0;
5        for(int i=0;i<n;i++){
6            if(operations[i].charAt(0)=='+'||operations[i].charAt(operations[i].length()-1)=='+'){
7                res++;
8                continue;
9            }
10            res--;
11        }
12        return res;
13    }
14}