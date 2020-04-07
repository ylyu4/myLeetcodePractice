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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q==null){
            return true;
        }
        
        /// Please notice put check null at first otherwise nullPointerException
        if((p==null && q!=null) || (p!=null && q==null) || p.val != q.val){
            return false;
        }
        
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }



    ///Iterative 
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        
        
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        
        s1.push(p);
        s2.push(q);
        
        while(!s1.isEmpty() && !s2.isEmpty()){
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();
            
            if(n1.val != n2.val){
                return false;
            }
            
            if(n1.left == null && n2.left != null){
                return false;
            }else if(n1.left != null && n2.left == null){
                return false;
            }else if(n1.right == null && n2.right != null){
                return false;
            }else if(n1.right != null && n2.right == null){
                return false;
            }
            
            if(n1.left != null && n2.left != null){
                s1.push(n1.left);
                s2.push(n2.left);
            }
            
            if(n1.right != null && n2.right != null){
                s1.push(n1.right);
                s2.push(n2.right);
            }
        }
        
        return true;
        
    }
}
