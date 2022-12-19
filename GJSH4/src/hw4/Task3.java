package hw4;

import java.util.ArrayDeque;

public class Task3 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode left;
        TreeNode right;
        if (root.right == null ^ root.left == null) {
            return false;
        } else if (root.left != null) {
            stack.push(root.left);
            stack.push(root.right);
        }
        while (!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();
            if (right.val != left.val) {
                return false;
            }
            if (left.left == null ^ right.right == null) {
                return false;
            } else if (right.right != null) {
                stack.push(left.left);
                stack.push(right.right);
            }
            if (left.right == null ^ right.left == null) {
                return false;
            } else if (right.left != null) {
                stack.push(left.right);
                stack.push(right.left);
            }
        }
        return true;
    }
}
