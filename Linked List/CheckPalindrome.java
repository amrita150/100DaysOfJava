public class CheckPalindrome {
    static class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
    public static boolean isPalindrome(Node head) {
        //optimized approach
        
        //step 1 -> find middle of LL
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }

    //step 3 -> compare 
    Node right = reverseLinkedList(slow);
    Node left = head;
    while(right!=null){
        if(right.data!=left.data){
            return false;
        }
        right = right.next;
        left = left.next;

    }
    return true;
  }


     // step 2 -> reverse the 2nd half of LL
     public static Node reverseLinkedList(Node head) {
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
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
      
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        printLinkedList(head);

        boolean isPalin = isPalindrome(head);
        System.out.println(isPalin);
    }
}


