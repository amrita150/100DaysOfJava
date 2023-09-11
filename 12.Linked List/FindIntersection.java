import java.util.*;

public class FindIntersection {
    static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static Node intersectedNode(Node head1 , Node head2){
    // //brute force approach O(m*n) time complexity
    // Node temp1 = head1;
    // while(temp1!=null){
    // Node temp2 = head2;
    // while(temp2!=null){
    // if(temp1.data==temp2.data){
    // return temp1;
    // }
    // temp2 = temp2.next;
    // }
    // temp1 = temp1.next;
    // }
    // return null;
    // }

    // optimized approach O(m+n) time complexity
    public static Node intersectedNode(Node head1, Node head2) {
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        Node temp1 = head1;
        Node temp2 = head2;
        int diff = Math.abs(length1 - length2);
        if (length1 > length2) {
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

    public static int getLength(Node head) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        return length;
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
        Node commonNode = new Node(5);
        Node head1 = new Node(5);
        head1.next = new Node(3);
        head1.next.next = commonNode;
        head1.next.next.next = new Node(10);
        head1.next.next.next.next = new Node(12);
        head1.next.next.next.next.next = new Node(15);
        printLinkedList(head1);

        Node head2 = new Node(10);;
        head2.next = commonNode;
        head2.next.next = new Node(12);
        head2.next.next.next= new Node(15);
        printLinkedList(head2);

        Node intersectPt = intersectedNode(head1, head2);
        if (intersectPt == null) {
            System.out.println("null");
        } else {
            System.out.println(intersectPt.data);
        }
    }
}
