// Last updated: 2/13/2026, 10:17:46 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        String[] s=new String[100];
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            s=str.split(" ");
            if(s.length>max){
                max=s.length;
            }
            //s=new String[0];
        }
        return max;
    }
}