//using queue
import java.util.*;
public class LevelOrder {
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

public static void levelOrder(Node root){
    if(root==null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode!=null){
            System.out.print(currNode.data +" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
        //if currNode is null
        else{
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
    }
}

  public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    LevelOrder tree = new LevelOrder();
    Node root = tree.buildTree(nodes);
    tree.levelOrder(root);
  }
}
