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

    /// Recursion
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.right != null){
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }else if(root.left != null){
            return minDepth(root.left)+1;
        }else if(root.right != null){
            return minDepth(root.right)+1;
        }else{
            return 1;
        }
    }



    ///BFS
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth = 1;
        
        Queue <TreeNode> q = new ArrayDeque<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int s = q.size();
            for(int i = 0; i < s; i++){
                TreeNode current = q.poll();
                if(current.left == null && current.right == null){
                    return depth++;
                }else{
                    if(current.left != null){
                        q.add(current.left);
                    }
                    if(current.right != null){
                        q.add(current.right);
                    }
                }
            }
            depth++;
        }
        
        return depth;
    }
}