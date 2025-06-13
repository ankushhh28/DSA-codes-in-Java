public class basicsOfLinkedList {

    // * Node class representing each element of the linked list
    public static class Node {
        int data; // * Value stored in the node
        Node next; // * Reference to the next node

        // * Constructor to initialize the node with data
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // * Creating individual nodes
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);

        // * Linking nodes to form a singly linked list: a -> b -> c -> d -> e -> f
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // * Printing the data values of all nodes
        System.out.println(
                "Linked List--> " + a.data + " " + b.data + " " + c.data + " " + d.data + " " + e.data + " " + f.data);
        System.out.println();
        System.out.println();

        // * Printing the references (addresses) of each node's next pointer
        System.out.println(a.next + " " + b.next + " " + c.next + " " + d.next + " " + e.next + " " + f.next);
        System.out.println();
        System.out.println();

        // * Printing the references (addresses) of current nodes
        System.out.println("Nodes address");
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }
}
