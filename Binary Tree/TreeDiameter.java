public class TreeDiameter {
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

    static class Info{
        int height;
        int diam;

        Info(int height , int diam){
            this.height = height;
            this.diam = diam;
        }
    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diamRoot = leftInfo.height + rightInfo.height + 1;

        
        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam) , diamRoot);
        int ht = Math.max(leftInfo.height , rightInfo.height) + 1;

        return new Info(ht , diam);
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

      
      System.out.print(diameter(root).diam);
    }   
}
