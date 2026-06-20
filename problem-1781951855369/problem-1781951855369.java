// Last updated: 6/20/2026, 4:07:35 PM
class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        String[] arr = s.split(" ");
        int count = 0;
        for(String s1 : arr){
            if(s1.length() != 0) count++;
        }
        return count;
    }
}