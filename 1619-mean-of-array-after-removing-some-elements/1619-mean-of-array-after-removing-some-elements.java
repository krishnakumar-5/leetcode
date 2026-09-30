class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int per=(5*arr.length)/100;
        int sum=0,c=0;
        for(int i=per;i<arr.length-per;i++){
            sum+=arr[i];
            c++;
        }
        return (double) sum/c;

    }
}