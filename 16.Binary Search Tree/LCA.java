public class LCA {
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

  public static Node lca(Node root , int n1 , int n2){
      if(root==null){
        return null;
      }
      if(n1<root.data && n2<root.data){
        return lca(root.left, n1, n2);
      } 
      if(n1>root.data && n2>root.data){
        return lca(root.right, n1, n2);
      } 

      return root;
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
    int n1 = 2;
    int n2 = 7;
    Node ans = lca(root , n1 , n2);
    System.out.println(ans.data);
  }
}