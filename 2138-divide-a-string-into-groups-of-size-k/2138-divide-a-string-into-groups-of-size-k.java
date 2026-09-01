class Solution {
    public String[] divideString(String s, int k, char fill) {
        int x=s.length()%k;
        StringBuilder str=new StringBuilder(s);
        if(x!=0){
        for(int i=0;i<k-x;i++){
            str.append(fill);
        }
        }
        String res[]=new String[str.length()/k];
        int st=0,end=k;
        for(int i=0;i<res.length;i++){
            res[i]=str.substring(st,end);
            st=end;
            end+=k;
        }
        return res;
    }
}