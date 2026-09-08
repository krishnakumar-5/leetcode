class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> set=new LinkedHashSet<>();
        LinkedList<String> li=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                li.remove(arr[i]);
            }else{
                li.add(arr[i]);
            }
        }
        if(li.size()<k) return "";
        return li.get(k-1);
    }
}