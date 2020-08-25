package levelOrder;

import treeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class NonRecur {
    public void levelOrder(TreeNode root){
        if (root == null) return ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }
}
