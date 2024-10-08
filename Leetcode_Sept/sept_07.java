public class sept_07 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null)
            return false;
        return next(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean next(ListNode head, TreeNode root) {
        if (head == null)
            return true;
        if (root == null || head.val != root.val)
            return false;
        return next(head.next, root.left) || next(head.next, root.right);
    }
}