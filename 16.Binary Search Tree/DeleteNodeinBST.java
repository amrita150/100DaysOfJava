public class DeleteNodeinBST {
    
    static class Node{
        int data;
        Node left;
       Node right;

      Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
  }

    public static Node inOrderSucc(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    
    public static Node delete(Node root, int val){
        //search 
        if(root == null) {
            return null;
        }

        else if(root.data > val) {
            root.left = delete(root.left, val);
        }

        else if(root.data < val) {
            root.right = delete(root.right, val);
        }

        else {
            //case 1
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2
            else if(root.left == null) {
               return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //case 3
            else {
                Node IS = inOrderSucc(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
            
       return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
       
    
    public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(12);
    root.left.left = new Node(2);
    root.left.right = new Node(7);
    root.left.right.right = new Node(8);
    root.right.right = new Node(14);
    root.right.right.right = new Node(16);

    // inorder(root);
    // System.out.println();

    root = delete(root, 5);
    inorder(root);
    }
}
