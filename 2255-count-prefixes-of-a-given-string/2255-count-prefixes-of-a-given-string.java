class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if((words[i].length()<=s.length())&&words[i].contains(s.substring(0,words[i].length()))){
                c++;
            }
        }
        return c;
    }
}