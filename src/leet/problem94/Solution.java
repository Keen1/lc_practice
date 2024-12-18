package leet.problem94;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> values = new ArrayList<>();
        if(root == null){
            return values;
        }
        if (root.left == null && root.right == null) {
            values.add(root.val);
            return values;
        }
        inorderTraversalHelper(root, values);
        return values;
    }

    public void inorderTraversalHelper(TreeNode root, List<Integer> values){

        if(root == null){
            return;
        }
        inorderTraversalHelper(root.left, values);
        values.add(root.val);
        inorderTraversalHelper(root.right, values);
    }
}
