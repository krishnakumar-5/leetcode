// Last updated: 6/18/2026, 10:43:38 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        String str[]=new String[score.length];
4        int arr[]=new int[score.length];
5        for(int i=0;i<score.length;i++){
6            arr[i]=score[i];
7        }
8        Arrays.sort(score);
9        int fst=0;
10        for(int i=score.length-1;i>=0;i--){
11            if(fst<3){
12                if(fst==0){
13                str[i]="Gold Medal";
14                }else if(fst==1){
15                    str[i]="Silver Medal";
16                }else{
17                    str[i]="Bronze Medal";
18                }
19                fst++;
20            }else{
21                str[i]=String.valueOf(++fst);
22            }
23        }
24        String res[]=new String[str.length];
25        for(int i=0;i<str.length;i++){
26            for(int j=0;j<str.length;j++){
27                if(arr[i]==score[j]){
28                    res[i]=str[j];
29                    break;
30                }
31            }
32        }
33        return res;
34        
35    }
36}