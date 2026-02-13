// Last updated: 2/13/2026, 10:18:22 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String [] str=s.split(" ");
        char[] ch=str[str.length-1].toCharArray();
        return ch.length;
    }
}