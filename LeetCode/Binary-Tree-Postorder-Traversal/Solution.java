1
2
3class Solution {
4    public List<Integer> postorderTraversal(TreeNode root) {
5         List<Integer> list = new ArrayList<>();
6        helper(root, list);
7        return list;
8    }
9
10    public void helper(TreeNode root, List<Integer> list) {
11        if (root == null) return;
12
13        helper(root.left, list);
14        helper(root.right, list);
15        list.add(root.val);
16    }
17}
18    
19