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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return isSymmetric(root.left,root.right);
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        
        if((left == null && right != null) || (left != null && right == null) || (left.val != right.val)){
            return false;
        }
        
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }


    ///Iterative
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left==null && root.right != null){
            return false;
        }else if(root.left!=null && root.right==null){
            return false;
        }else if(root.left == null && root.right == null){
            return true;
        }
        
        Stack <TreeNode> s1 = new Stack<>();
        Stack <TreeNode> s2 = new Stack<>();
        s1.push(root.left);
        s2.push(root.right);
        
        while(!s1.isEmpty() && !s2.isEmpty()){
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();
            
            if(n1.left == null && n2.right != null){
                return false;
            }else if(n1.left != null && n2.right == null){
                return false;
            }else if(n1.right != null && n2.left == null){
                return false;
            }else if(n1.right == null && n2.left != null){
                return false;
            }else if(n1.val != n2.val){
                return false;
            }
            
            if(n1.left != null && n2.right != null){
                s1.push(n1.left);
                s2.push(n2.right);
            }
            
            if(n1.right != null && n2.left != null){
                s1.push(n1.right);
                s2.push(n2.left);
            }
        } 
        return true;
    }
}