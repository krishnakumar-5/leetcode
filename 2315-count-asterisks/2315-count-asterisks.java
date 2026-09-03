class Solution {
    public int countAsterisks(String s) {
        boolean a=true;
        int res=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'&&a){
                res++;
            }
            if(s.charAt(i)=='|'){
                c++;
                a=false;
                if(c==2){
                    c=0;
                    a=true;
                }
            }
        }
        return res;
    }
}