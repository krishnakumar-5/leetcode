// Last updated: 5/29/2026, 2:43:17 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj=new ArrayList<>();
4        for(int i=0;i<numCourses;i++){
5            adj.add(new ArrayList<>());
6        }
7        int []indegree=new int[numCourses];
8        for(int[] pre:prerequisites){
9            int course=pre[0];
10            int prereq=pre[1];
11            adj.get(prereq).add(course);
12            indegree[course]++;
13        }
14        Queue<Integer>q=new LinkedList<>();
15        for(int i=0;i<numCourses;i++){
16            if(indegree[i]==0){
17                q.offer(i);
18            }
19        }
20        int complete=0;
21        while(!q.isEmpty()){
22            int temp=q.poll();
23            for(int neigh:adj.get(temp)){
24                indegree[neigh]--;
25                if(indegree[neigh]==0){
26                    q.offer(neigh);
27                }
28            }
29            complete++;
30        }
31        return complete==numCourses;
32
33
34    }
35}