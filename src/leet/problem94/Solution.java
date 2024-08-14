package leet.problem94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> inorderList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root){
        if(root.left != null){
            inorderTraversal(root.left);

        }
        inorderList.add(root.val);

        if(root.right != null){
            inorderTraversal(root.right);
            inorderList.add(root.val);

        }


        return inorderList;

    }
}

