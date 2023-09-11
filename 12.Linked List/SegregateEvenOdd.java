public class SegregateEvenOdd {

    static class Node {
        public int data;
        public Node next;
   
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node segregateEvenOdd(Node head){
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node curr = head;
        while(curr!=null){
            int element = curr.data;
            //for even
            if(element%2 == 0){
                if(evenStart==null){
                    evenStart = curr;
                    evenEnd = evenStart;
                }
                else{
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }
            else{
                if(oddStart==null){
                    oddStart = curr;
                    oddEnd = oddStart;
                }
                else{
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }

            curr = curr.next;
        }

        if(evenStart==null || oddStart==null){
            return head;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;

        return head;
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

        Node newHead = segregateEvenOdd(head);
        printLinked(newHead);    
    }
}