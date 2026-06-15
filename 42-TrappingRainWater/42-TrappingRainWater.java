// Last updated: 6/15/2026, 4:16:14 PM
1class Solution {
2    public int trap(int[] height) {
3        if(height==null || height.length<3){
4            return 0;
5        }
6        int leftmax=height[0];
7        Stack<Integer> s=new Stack<>();
8        s.push(height[height.length-1]);
9        for(int i=height.length-2;i>=2;i--){
10            s.push(Math.max(height[i],s.peek()));
11        }
12        int water=0;
13        for(int i=1;i<height.length-1;i++){
14            int minHeight=Math.min(leftmax,s.peek());
15            water=water+Math.max(0,minHeight-height[i]);
16            s.pop();
17            leftmax=Math.max(leftmax,height[i]);
18        }
19        return water;
20    }
21}