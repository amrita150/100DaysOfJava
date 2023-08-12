class DeleteMid{
 
 static class Node {
     public int data;
     public Node next;

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
 }

    //when we have access to head
    public static void deleteMid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;

    }

    //when we dont hav eaccess to head
    public static void dltNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;   
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
        // head.next.next.next.next = new Node(5);

        printLinkedList(head);
        // deleteElem(3 , head);
        // printLinkedList(head);
        deleteMid(head);
        printLinkedList(head);

    }
}