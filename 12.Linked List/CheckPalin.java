public class CheckPalin {
    static class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
    public static boolean isPalindrome(Node head) {
    //O(n) space and O(n) time
    //brute force approach , store elements of Linked List in an array 
    //or string and then check if LL is palin or not
    StringBuilder sb = new StringBuilder();
    Node temp = head;

    while(temp!=null){
        sb.append(temp.data);
        temp = temp.next;
    }

    String str = sb.toString();
    int start = 0 ;
    int end = str.length()-1;
    while(start<=end){
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
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


