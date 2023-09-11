import java.util.LinkedList;
public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        Node head=null;
        
        //empty
        public boolean isEmpty(){
            return head==null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(head==null){
              head = newNode;
              return;
            }

            newNode.next= head;
            head = newNode;
        }

        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
