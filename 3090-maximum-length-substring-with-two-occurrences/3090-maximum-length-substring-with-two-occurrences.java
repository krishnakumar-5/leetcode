class Solution {
    public int maximumLengthSubstring(String s) {
        // int arr[]=new int[27];
        // int max=0,c=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     arr[s.charAt(i)-97]++;
        //     if(arr[s.charAt(i)-97]>2){
        //         max=Math.max(max,c);
        //         Arrays.fill(arr,0);
        //         c=0;
        //     }else{
        //         c++;
        //     }
        // }
        // return max;
        int[] freq= new int[26];
        int left=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
            while(freq[s.charAt(i)-'a']>2)
            {
                freq[s.charAt(left)-'a']--;
                left++;
            }
            if(i-left+1>max)
            {
                max=i-left+1;
            }
        }
        return max;
    }
}