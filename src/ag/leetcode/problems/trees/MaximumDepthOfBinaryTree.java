package ag.leetcode.problems.trees;

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

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
