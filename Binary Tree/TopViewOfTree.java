import java.util.*;

public class TopViewOfTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class QueueInfo {
        Node node;
        int horiDiam;

        QueueInfo(Node node, int horiDiam) {
            this.node = node;
            this.horiDiam = horiDiam;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }
        // We do level order traversal
        Queue<QueueInfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int max = 0, min = 0;
        q.add(new QueueInfo(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            QueueInfo curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.horiDiam)) {
                    map.put(curr.horiDiam, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new QueueInfo(curr.node.left, curr.horiDiam - 1));
                    min = Math.min(min, curr.horiDiam - 1);
                }

                if (curr.node.right != null) {
                    q.add(new QueueInfo(curr.node.right, curr.horiDiam + 1));
                    max = Math.max(max, curr.horiDiam + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7  

        expected output : 4 2 1 3 7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
            1
           / \
          2   3
           \ 
            4  
             \
              5
               \
                6 

        expected output : 2 1 3 6
        */
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.left.right.right = new Node(5);
        root2.left.right.right.right = new Node(6);

        topView(root);
        topView(root2);
    }
}
