public class StartingPointInLL {

 static class Node {
     public int data;
     public Node next;

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
 }
    public static Node firstNode(Node head) {
            Node slow = head;
            Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
            if(fast==null || fast.next==null){
                return null;
            }
            fast = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            
        return fast;
    
    }

    public static void main(String[] args) {
      
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // cycle in the linked list
        // head.next.next.next.next = head.next;
        //1->2->3->4->2

        Node startingNode = firstNode(head);
        if (startingNode != null) {
            System.out.println("Starting node of the cycle: " + startingNode.data);
        } else {
            System.out.println("There is no cycle in the linked list.");
        }        
    }
}
