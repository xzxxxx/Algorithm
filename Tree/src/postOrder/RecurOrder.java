package postOrder;

import treeNode.TreeNode;

public class RecurOrder {
    public void recur(TreeNode root) {
        if(root == null) return;
        recur(root.left);
        recur(root.right);
        System.out.println(root.val);
    }
}
