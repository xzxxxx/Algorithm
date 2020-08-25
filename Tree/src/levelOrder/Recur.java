package levelOrder;

import treeNode.TreeNode;

public class Recur {
    public static void recurLevel(TreeNode root){
        int depth = depth(root); //递归层序遍历需要知道树的深度
        for (int i = 1; i <= depth; i++){
            levelOrder(root,i);
        }
    }

    private static int depth(TreeNode root){
        if(root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.max(left,right) + 1;
    }

    private static void levelOrder(TreeNode root,int depth){
        if(root == null) return;
        if(depth == 1) System.out.println(root.val);
        else{
            levelOrder(root.left,depth - 1);
            levelOrder(root.right,depth - 1);
        }
    }
}
