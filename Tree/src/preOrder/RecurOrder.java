package preOrder;

import treeNode.TreeNode;

public class RecurOrder {
    public void recur(TreeNode root){
        if(root == null) return ;
        System.out.println(root.val);
        recur(root.left);
        recur(root.right);
    }
}
