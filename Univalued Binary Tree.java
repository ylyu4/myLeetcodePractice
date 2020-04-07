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

    ///Recursion
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        
        int value = root.val;
        if(root.left != null){
            if(root.left.val != value){
                return false;
            }
        }
        if(root.right != null){
            if(root.right.val != value){
                return false;
            }
        }
        
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }



    ///Iterative
    public boolean isUnivalTree(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        Queue<TreeNode> que = new LinkedList<>();
        
        que.add(root);
        int value = root.val;
        
        while(!que.isEmpty()){
            TreeNode i = que.poll();
            if(i.val != value){
                return false;
            }
            
            if(i.left != null){
                que.add(i.left);
            }
            if(i.right != null){
                que.add(i.right);
            }
        }    
        return true;
    }
}