package postOrder;

import treeNode.TreeNode;

import java.util.Stack;

public class NonRecur {
    //后续遍历非递归，使用两个栈
    public void postOrder(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode node = s1.pop();
            s2.push(node);
            if(node.left != null) s1.push(root.left);
            if(node.right != null) s1.push(root.right);
        }
        while(!s2.isEmpty()){
            System.out.println(s2.pop());
        }

    }
}
