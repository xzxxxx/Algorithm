package inOrder;

import treeNode.TreeNode;

import java.util.Stack;

public class NonRecur {
    public void inOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                TreeNode node = stack.pop();
                System.out.println(node);
                root = root.right;
            }
        }
    }
}
