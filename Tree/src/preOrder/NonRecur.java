package preOrder;

import treeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NonRecur {
    public void preOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
    }
}
