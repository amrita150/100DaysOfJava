public class LowestCommonAncestor1 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     //Approach 2 - Find first node which found n1 & n2 in it's subtrees
    public static Node lca(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }

        if(root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftFound = lca(root.left, n1, n2);
        Node rightFound = lca(root.right, n1, n2);

        if(leftFound == null) {
            return rightFound;
        } else if(rightFound == null) {
            return leftFound;
        } else {
            return root;
        }
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
