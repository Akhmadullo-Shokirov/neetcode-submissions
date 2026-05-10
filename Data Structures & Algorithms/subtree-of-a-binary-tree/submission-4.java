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
    // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    //     if(root != null && subRoot != null && root.val == subRoot.val) {
    //         return isSameTree(root, subRoot);
    //     }
    //     if(root == null || subRoot == null) return false;
    //     return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    //     if (root == null) return false;

    //     if (root.val == subRoot.val && isSameTree(root, subRoot)) {
    //         return true;
    //     }

    //     return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if(p == null && q == null) return true;
    //     if(p != null && q == null || 
    //         p == null && q != null || p.val != q.val) return false;
    //     return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    // }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String tree1 = serialize(root);
        String tree2 = serialize(subRoot);
        return tree1.contains(tree2);
    }

    private String serialize(TreeNode node) {
        if (node == null) return "null,";
        return node.val + "," + serialize(node.left) + serialize(node.right);
    }
}
