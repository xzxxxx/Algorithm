package inOrder;

import treeNode.TreeNode;

public class Recur {
    public void recur(TreeNode root){
        if(root == null) return;
        recur(root.left);
        System.out.println(root.val);
        recur(root.right);
    }
}
