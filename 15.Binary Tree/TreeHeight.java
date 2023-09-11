public class TreeHeight {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;
    public static Node buildTree(int node[]){
        idx++;
        if(idx >= node.length || node[idx]==-1){
            return null;
        }

        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);

        return newNode;
    }

    public static int treeHeight(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        return Math.max(leftHeight , rightHeight) + 1;
    }

    public static void main(String[] args) {
        int data[] ={1,2,4,-1,-1,5,6,-1,6,-1,7,-1,-1,3};
        TreeHeight tree = new TreeHeight();
        Node root = tree.buildTree(data);
        int height = tree.treeHeight(root);
        System.out.print(height);
    }
}
