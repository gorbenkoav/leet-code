package ag.leetcode.problems.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return maxDepth(0, root);
    }

    private int maxDepth(int depth, TreeNode node) {
        if (node != null) {
            return Math.max(maxDepth(depth + 1, node.left), maxDepth(depth + 1, node.right));
        }
        return depth;
    }


    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode node;
        int floorSize;
        while (!queue.isEmpty()) {
            floorSize = queue.size();
            while (floorSize > 0) {
                node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                floorSize--;
            }
            count++;
        }

        return count;
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
