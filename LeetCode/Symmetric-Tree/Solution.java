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
17
18    boolean fun(TreeNode root1, TreeNode root2) {
19        if (root1 == null && root2 == null) return true;
20        if (root1 == null || root2 == null) return false;
21        if (root1.val != root2.val) return false;
22
23        boolean r1 = fun(root1.left, root2.right);
24        boolean r2 = fun(root1.right, root2.left);
25        return r1 && r2;
26    }
27
28    public boolean isSymmetric(TreeNode root) {
29        return fun(root.left, root.right);
30    }
31}
32    
33