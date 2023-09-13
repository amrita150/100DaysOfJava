import java.util.*;

public class LowestCommonAncestor {
     static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean rootToNodePath(Node root, int node, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }

        path.add(root);

        if(root.data == node) {
            return true;
        }

        if(root.left != null && rootToNodePath(root.left, node, path)) {
            return true;
        }
        if(root.right != null && rootToNodePath(root.right, node, path)) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }


     public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        rootToNodePath(root, n1, path1);
        rootToNodePath(root, n2, path2);

        int i=0;
        for(;i<path1.size() && i<path2.size(); i++) {
            if(!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }

        return path1.get(i-1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node lca = lca(root, 4, 5);
        if(lca != null)
            System.out.println(lca.data);
    }
}
