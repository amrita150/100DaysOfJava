import java.util.*;

public class MyLinkedList {
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

    //to add value to a linked list from start
    public void addValue(int data) {
        //create new node
        Node newNode = new Node(data);
        //to print size of linkedList
        size++;
        //special case , if linked list is null
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //newNode's next starts pointing to head
        newNode.next = head;

        //head = newNode
        head = newNode;
    }

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

    public void addMiddle(int index, int data)
    {
        Node newNode = new Node(data);
        size++;
        if(index==0)
        {
            addValue(data);
            size--;
            return;
        }
        Node temp = head;
        int i = 0 ;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.print();
        linkedList.addValue(2);
        linkedList.print();
        linkedList.addValue(1);
        linkedList.print();
        linkedList.addLast(3);
        linkedList.print();
        linkedList.addLast(4);
        linkedList.print();
        linkedList.addMiddle(3,67);
        linkedList.print();
        linkedList.addMiddle(0,5);
        linkedList.print();
        System.out.println(linkedList.size);
    }
}
