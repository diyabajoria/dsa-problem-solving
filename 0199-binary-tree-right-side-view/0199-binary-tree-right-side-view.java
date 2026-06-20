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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        rightview(root, list,0);
        return list;
    }
    public void rightview(TreeNode curr, List<Integer> list, int v)
    {
        if(curr==null)
        {
            return;
        }
        if(list.size()==v)
        {
            list.add(curr.val);
        }
        rightview(curr.right, list, v+1);
        rightview(curr.left, list, v+1);
    }
}