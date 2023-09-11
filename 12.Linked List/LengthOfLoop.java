public class LengthOfLoop {

 static class Node {
     public int data;
     public Node next;

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
 }
   public static int lengthOfLoop(Node head) {
         Node slow = head;
         Node fast = head;
         int size = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                size++;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    size++;
                }
                return size;
            }
        }
            
        return 0;

    }

    public static void main(String[] args) {
      
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // cycle in the linked list
        head.next.next.next.next = head.next;
        //1->2->3->4->2


        System.out.println(lengthOfLoop(head));      
    }
}


