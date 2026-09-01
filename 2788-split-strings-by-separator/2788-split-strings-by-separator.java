class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> li=new LinkedList<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==separator||i==s.length()-1){
                    if(i==s.length()-1&&s.charAt(i)!=separator){
                        sb.append(s.charAt(i));
                    }
                    if(sb.length()!=0){
                    li.add(sb.toString());
                    }
                    sb=new StringBuilder();
                    continue;
                }
                sb.append(s.charAt(i));
            }
        }
        return li;
    }
}