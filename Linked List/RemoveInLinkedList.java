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
            System.out.println("Linked List is empty");
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
        if(size==0)
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
          }

          int val = prev.next.data; //tail.data
          prev.next = null;
          tail = prev;
          size--;
          return val; 
    }

    public static void main(String[] args) {
        RemoveInLinkedList linkedList = new RemoveInLinkedList();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
    }
}
