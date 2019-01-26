import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q652FindDuplicateSubtrees {
    HashMap<String, Integer> map = new HashMap();
    List<TreeNode> list = new ArrayList();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return list;
    }

    public String dfs(TreeNode root) {
        if (root == null) return "#";
        String serial = root.val + dfs(root.left) + dfs(root.right);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) list.add(root);
        return serial;
    }
}