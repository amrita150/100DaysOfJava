public class InOrder {
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

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void main(String[] args) {
        int data[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        InOrder tree = new InOrder();
        Node root = tree.buildTree(data);
        tree.inOrder(root);
    }
}