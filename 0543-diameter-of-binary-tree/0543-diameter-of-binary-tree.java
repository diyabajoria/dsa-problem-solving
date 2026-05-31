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
    int m=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return m;
    }
    public int findMax(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int lh=findMax(root.left);
        int rh=findMax(root.right);
        m=Math.max(m,lh+rh);
        
        return (Math.max(lh,rh))+1;

    }
}