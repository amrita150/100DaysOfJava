class ReverseLL {
    
    static class Node {
        public int data;
        public Node next;
   
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
       //iterative 
        if(head == null || head.next == null){
            return head;
        }

        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printLinked(Node startNode) {
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

        printLinked(head);

        Node reversed = ReverseLL.reverseList(head);
        printLinked(reversed);
    }
}