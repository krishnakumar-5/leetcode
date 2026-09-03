class Solution {
    public String largestGoodInteger(String num) {
        List<String> li=List.of("000","111","222","333","444","555","666","777","888","999");
        int max=0;
        boolean a=true;
        for(int i=0;i<=num.length()-3;i++){
            if(li.contains(num.substring(i,i+3))){
                a=false;
                if(max<num.charAt(i)-'0'){
                    max=num.charAt(i)-'0';
                }
            }
        }
        if(!a){
        return String.valueOf(max).repeat(3);
        }
        return "";

    }
}