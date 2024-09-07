import java.util.ArrayList;
import java.util.List;

public class bin_tree_path {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
    
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public List<String> ans = new ArrayList<>();
    public List<String> t = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        t.add(root.val + "");
        if (root.left == null && root.right == null) {
            ans.add(String.join("->", t));
        } else {
            dfs(root.left);
            dfs(root.right);
        }
        t.remove(t.size() - 1);
    }

    public static void main(String[] args) {
        bin_tree_path a = new bin_tree_path();
        TreeNode root = a.new TreeNode(1);
        root.left = a.new TreeNode(2);
        root.right = a.new TreeNode(3);
        root.left.right = a.new TreeNode(5);
        System.out.println(a.binaryTreePaths(root));
    }
}
