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
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode node) {
        if(node == null) return 0;
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);
        if(Math.abs(rightHeight - leftHeight) > 1) {
            result = false;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
