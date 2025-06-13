public class traversalLL {

    // * List Node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    // ! ----------------------------------------------------------------

    // * Function for printing the linked list
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // * Recursive function for displaying Linked List
    public static void recursiveFunctionForPrintLL(Node head) {
        // * Base case
        if (head == null)
            return;
        System.out.print(head.data + " ");
        recursiveFunctionForPrintLL(head.next);
    }

    // * Reverse order traversal of Linked List
    public static void printLLinReverseOrder(Node head) {
        // * Base case
        if (head == null)
            return;
        printLLinReverseOrder(head.next);
        System.out.print(head.data + " ");
    }

    // * Length of Linked List
    public static void printLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        System.out.print("Length of Linked List: " + count);
    }

    // * Length of Linked List using Recursion
    public static void findLength(Node head, int count) {
        if (head == null) {
            System.out.println("Length of Linked List using Recursion: " + count);
            return;
        }
        findLength(head.next, count = count + 1);
    }

    // * Insert at end when only head is given
    public static void insertAtEnd(Node head, int val) {
        Node newVal = new Node(val);
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newVal;

    }

    // ! ----------------------------------------------------------------

    public static void main(String[] args) {
        // * Creating nodes of the linked list
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);

        // * Linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;

        // * Printing linked list using iterative method
        printLinkedList(a);
        System.out.println();

        // * Printing linked list using recursion
        recursiveFunctionForPrintLL(a);
        System.out.println();

        // * Printing linked list in reverse order
        printLLinReverseOrder(a);
        System.out.println();

        // * Printing length of linked list using loop
        printLength(a);
        System.out.println();

        // * Printing length of linked list using recursion
        findLength(a, 0);

        // * Inserting any element at end when head is given
        insertAtEnd(a, 14);
        printLinkedList(a);
    }
}
