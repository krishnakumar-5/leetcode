// Last updated: 5/27/2026, 11:37:00 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> list=new ArrayList<>();
19        Queue<TreeNode> q=new LinkedList<>();
20        if(root==null){
21            return list;
22        }
23        q.add(root);
24        boolean l2r=true;
25        while(!q.isEmpty()){
26            int size=q.size();
27            List<Integer> l=new ArrayList<>();
28            for(int i=0;i<size;i++){
29                TreeNode node=q.poll();
30                if(l2r){
31                    l.add(node.val);
32                }
33                else{
34                    l.add(0,node.val);
35                }
36                if(node.left!=null){
37                    q.offer(node.left);
38                }
39                if(node.right!=null){
40                    q.offer(node.right);
41                }
42            }
43            list.add(l);
44            l2r=!l2r;
45            
46        }
47        return list;
48    }
49}