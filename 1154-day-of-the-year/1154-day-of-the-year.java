class Solution {
    public int dayOfYear(String date) {
        String[] d=date.split("-");
        int y=Integer.parseInt(d[0]);
        int m=Integer.parseInt(d[1]);
        int dd=Integer.parseInt(d[2]);
        int res=0;
        if(((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))&&m>2){
            res++;
        }
        res+=dd;
        m=m-1;
        if(m==1) res+=31;
        else if(m==2) res+=59;
        else if(m==3) res+=90;
        else if(m==4) res+=120;
        else if(m==5) res+=151;
        else if(m==6) res+=181;
        else if(m==7) res+=212;
        else if(m==8) res+=243;
        else if(m==9) res+=273;
        else if(m==10) res+=304;
        else if(m==11) res+=334;
        return res;
    }
}