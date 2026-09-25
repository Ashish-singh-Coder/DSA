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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> list = new ArrayList<>();
19        helper(root, list);
20        return list;
21    }
22
23    private void helper(TreeNode root, List<Integer> list) {
24        if (root == null) return;
25        list.add(root.val);
26        helper(root.left, list);
27        helper(root.right, list);
28    }
29}