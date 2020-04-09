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
    public ArrayList<Integer> arr = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        
        arr.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return arr;
    }

    ///Iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            arr.add(cur.val);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
        
        return arr;
    }
}