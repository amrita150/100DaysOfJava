class MiddleOfLL{
 
 static class Node {
     public int data;
     public Node next;

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
 }

    public static Node findMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printLinkedList(Node startNode) {
        Node current = startNode;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printLinkedList(head);
        // Find the middle node of the linked list
        Node middleNode = findMiddle(head);

        printLinkedList(middleNode);
    }
}