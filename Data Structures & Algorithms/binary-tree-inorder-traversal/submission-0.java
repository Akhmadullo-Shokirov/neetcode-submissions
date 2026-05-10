/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList();
        if(root == null) return values;
        if(root.left != null)
            values.addAll(inorderTraversal(root.left));
        values.add(root.val);

        if(root.right != null)
            values.addAll(inorderTraversal(root.right));

        return values;
    }
}