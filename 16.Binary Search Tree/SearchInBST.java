public class SearchInBST {
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

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
           return search(root.left, key);
        }
        if(key>root.data){
           return search(root.right, key);
        }
        
        return false;
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
    int key = 7;
    boolean res = search(root,key);
    System.out.print(res);
    }
}
