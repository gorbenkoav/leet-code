package ag.leetcode.problems.trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2    2
 * / \  / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * <p>
 * https://leetcode.com/problems/symmetric-tree/description/
 */
public class SymmetricTree {

    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> left = new LinkedList<>();
        left.add(root.left);
        Queue<TreeNode> right = new LinkedList<>();
        right.add(root.right);

        return isSymmetricRecursive(left, right);
    }

    private boolean isSymmetricRecursive(Queue<TreeNode> left, Queue<TreeNode> right) {
        int size;
        TreeNode leftNode;
        TreeNode rightNode;

        size = left.size();
        for (int i = 0; i < size; i++) {
            leftNode = left.remove();
            rightNode = right.remove();

            if (!isEqual(leftNode, rightNode)) {
                return false;
            }

            if (leftNode != null) {
                Collections.addAll(left, leftNode.left, leftNode.right);
            }

            if (rightNode != null) {
                Collections.addAll(right, rightNode.right, rightNode.left);
            }
        }

        return (left.isEmpty() && right.isEmpty()) || isSymmetricRecursive(left, right);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> left = new LinkedList<>();
        left.add(root.left);
        Queue<TreeNode> right = new LinkedList<>();
        right.add(root.right);

        int size;
        TreeNode leftNode;
        TreeNode rightNode;
        while (!left.isEmpty()) {
            size = left.size();
            for (int i = 0; i < size; i++) {
                leftNode = left.remove();
                rightNode = right.remove();

                if (!isEqual(leftNode, rightNode)) {
                    return false;
                }

                if (leftNode != null) {
                    Collections.addAll(left, leftNode.left, leftNode.right);
                }

                if (rightNode != null) {
                    Collections.addAll(right, rightNode.right, rightNode.left);
                }
            }
        }

        return true;
    }

    private final boolean isEqual(TreeNode left, TreeNode right) {
        return (left == null && right == null) || (left != null && right != null && left.val == right.val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
