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

    /// DFS
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        
        sum = sum - root.val;
        
        if(root.left == null && root.right == null && sum == 0){
            return true;
        }
        
        
        return (root.left != null && hasPathSum(root.left, sum)) || (root.right != null && hasPathSum(root.right, sum));
    }
}