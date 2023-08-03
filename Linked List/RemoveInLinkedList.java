import java.util.*;

public class RemoveInLinkedList {
    public class Node {
        //data
        int data;
        //nodes
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        //special case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size==0)
        {
            System.out.println("Linked head is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
            int val = head.data;
            head = head.next;
            size--;
            return val;
    }

    public int removeLast(){
        if(head == null || head.next == null){
             int val = head.data;
            head = null;
            return val;
        }

        Node temp = head;
         int val = head.data;
        while(temp.next.next != null){
                temp = temp.next;
        }
        temp.next = null;
        return val; 
    }

    // //another way 
    // public int deleteLastNode() {
    //     if (head == null) {
    //     int val = head.data;
    //         return val;
    //     } else if (head == tail) {
    //         // Only one node in the list
    //         head = null;
    //         tail = null;
    //     } else {
    //                 int val = head.data;
    //         Node current = head;
    //         while (current.next != tail) {
    //             current = current.next;
    //         }

    //         current.next = null; // Delete the last node
    //         tail = current; // Update the tail reference
        
    //        return val; 
    // }
    

    public static void main(String[] args) {
        RemoveInLinkedList linkedhead = new RemoveInLinkedList();

        linkedhead.addLast(1);
        linkedhead.addLast(2);
        linkedhead.addLast(3);
        linkedhead.addLast(4);
        linkedhead.print();
        linkedhead.removeFirst();
        linkedhead.print();
        linkedhead.removeLast();
        linkedhead.print();
        System.out.println(linkedhead.size);
    }
}
