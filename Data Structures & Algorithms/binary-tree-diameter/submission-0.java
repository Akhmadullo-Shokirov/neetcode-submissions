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
    private int maxLength = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxLength;
    }

    public int dfs(TreeNode node) {
        int length = 0;
        if(node == null) return length;
        int leftLength = dfs(node.left);
        int rightLength = dfs(node.right);
        length = Math.max(leftLength, rightLength) + 1;
        maxLength = Math.max(maxLength, leftLength + rightLength);
        return length;
    }
}
