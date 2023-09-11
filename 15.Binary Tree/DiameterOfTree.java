//approach 1
import java.util.*;

public class DiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight , rightHeight) + 1;
    }
    //aproach 1 
    //O(n^2) time complexity
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        //if my diameter passing through root
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiam = leftHeight + rightHeight + 1;
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);

        return Math.max(Math.max(leftDia , rightDia) , selfDiam);

    }

    public static void main(String[] args) {
      Node root = new Node(1);
      root.left =   new Node(7);
      root.right = new Node(5);
      root.left.left = new Node(4);
      root.left.right = new Node(3);
      root.right.left = new Node(2);
      root.right.right = new Node(6);  
      root.right.left.left = new Node(5);

      
    int result = diameter(root);
    System.out.print(result);
    }
}
