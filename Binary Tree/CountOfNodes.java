public class CountOfNodes {
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

    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        int total = leftCount + rightCount + 1;

        return total;
    }

    public static void main(String[] args) {
      Node root = new Node(1);
      root.left =   new Node(7);
      root.right = new Node(5);
      root.left.left = new Node(4);
      root.left.right = new Node(3);
      root.right.left = new Node(2);
      root.right.right = new Node(6);  

    int result = count(root);
    System.out.print(result);
    }
}
