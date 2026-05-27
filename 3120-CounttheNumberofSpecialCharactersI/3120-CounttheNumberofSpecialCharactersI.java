// Last updated: 5/27/2026, 9:37:54 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        Set<Character> set=new HashSet<>();
4        for(int i=0;i<word.length();i++){
5            set.add(word.charAt(i));
6        }
7        int c=0;
8        for(Character k:set){
9            for(Character g:set){
10                if(Math.abs((int)k-(int)g)==32){
11                    c++;
12                    break;
13                }
14            }
15        }
16        return c/2;
17    }
18}