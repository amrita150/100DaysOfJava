class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
        this.next = null;
    }
}

class Partition {
    public static ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode leftT = left;
        ListNode rightT = right;

        while (head != null) {
            if (head.val < x) {
                leftT.next = head;
                leftT = leftT.next;
            } else {
                rightT.next = head;
                rightT = rightT.next;
            }
            head = head.next;
        }
        leftT.next = right.next;
        rightT.next = null;

        return left.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        ListNode result = partition(head, x);

        System.out.println("Original Linked List:");
        printList(head);

        System.out.println("Partitioned Linked List:");
        printList(result);
    }
}
