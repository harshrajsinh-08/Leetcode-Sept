import java.util.*;

class sum_of_left_leaves {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else {
                    stack.push(node.left);
                }
            }

            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        sum_of_left_leaves solution = new sum_of_left_leaves();
        TreeNode node1 = solution.new TreeNode(3);
        TreeNode node2 = solution.new TreeNode(9);
        TreeNode node3 = solution.new TreeNode(20);
        TreeNode node4 = solution.new TreeNode(15);
        TreeNode node5 = solution.new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        int sum = solution.sumOfLeftLeaves(node1);
        System.out.println("Sum of left leaves: " + sum);
    }
}