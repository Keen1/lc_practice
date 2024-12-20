package leet.problem101;

public class Solution {

    public boolean isSymmetric(TreeNode root){
        //if the list is null return
        //otherwise run the helper and split the tree into the respective left and right subtrees
        return root == null || isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        //if either node is null, return the result of the object comparison
        if(left == null || right == null){
            return left == right;
        }
        //if the values don't match, the tree is not symmetric
        if(left.val != right.val){
            return false;
        }
        //need to perform Symmetric checks on subtrees
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
