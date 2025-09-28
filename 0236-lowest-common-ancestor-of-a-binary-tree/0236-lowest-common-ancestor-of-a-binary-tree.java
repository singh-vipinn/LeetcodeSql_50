/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //Base Case: If current node is null or matches p or q return it
        if(root == null || root == p || root == q) {
            return root;
        }

        //Recurse on both subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //If both non-null, current node is LCA
        if(left != null && right != null) {
            return root;
        }

        // Otherwise return the non-null result
        return left != null ? left : right;
    }
}