public class implementationOfLinkedList {

    // * Node class representing each element of the linked list
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    // ! ---------------------------------------------------------------------

    // * Linked List class with insertion and utility methods
    public static class linkedList {
        Node head = null;
        Node tail = null;

        // * Insert a node at the end of the linked list
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null)
                head = temp;
            else
                tail.next = temp;
            tail = temp;
        }

        // * Insert a node at the beginning of the linked list
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // * Insert a node at a specific index in the linked list
        void insertInBetween(int index, int val) {
            // * Step 1: Create a new node with the given value
            Node newVal = new Node(val);
            Node temp = head;

            // * Step 2: Handle edge cases
            if (index == size()) {
                // * If index is equal to size, insert at the end
                insertAtEnd(val);
                return;
            } else if (index == 0) {
                // * If index is 0, insert at the beginning
                insertAtBeginning(val);
                return;
            } else if (index > size() || index < 0) {
                // * If index is invalid (greater than size or negative), show error
                System.out.println("Wrong index given...");
                return;
            }

            // * Step 3: Traverse the list to the (index - 1)th node
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            // * Step 4: Insert the new node after (index - 1)th node
            newVal.next = temp.next;
            temp.next = newVal;
        }

        // * get Element by index
        int getElement(int index) {
            Node temp = head;
            int count = 0;
            while (temp != null) {

                if (count == index) {
                    return temp.data;
                }
                temp = temp.next;
                count++;
            }
            return 0;
        }

        // * Delete the node at a given index
        void deleteAtIndex(int index) {
            if (index == 0) {
                // * If index is 0, remove the head node
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            // * Skip over the node at the given index
            temp.next = temp.next.next;

            if (temp.next == null)
                // * If last node was deleted, update tail
                tail = temp;
        }

        // * Display the entire linked list
        void dispalyLinkedList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // * Recursive search for element of linked list
        int searchElement(int key) {
            Node temp = head;
            return helper(temp, key, 0);
        }
        int helper(Node temp, int key, int idx) {
            // * Base case
            if (temp == null) {
                return -1;
            }
            if (temp.data == key) {
                return idx;
            }
            return helper(temp.next, key, idx + 1);
        }

        // * Return the size (length) of the linked list
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        // * Creating a new linked list
        linkedList ll = new linkedList();

        // * Inserting elements at the end
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        // * Displaying the linked list
        ll.dispalyLinkedList();
        System.out.println();

        // * Printing the length of the linked list
        System.out.println("Length of Linked List: " + ll.size());

        // * Inserting elements at the beginning
        ll.insertAtBeginning(2);
        ll.insertAtBeginning(1);

        // * Displaying the updated linked list
        ll.dispalyLinkedList();
        System.out.println();

        // * Insert element in between of linked list
        ll.insertInBetween(3, 100);
        ll.dispalyLinkedList();
        System.out.println();

        // * get Element by index
        System.out.println(ll.getElement(3));
        // * delete Element at index
        ll.deleteAtIndex(3);
        ll.dispalyLinkedList();
        System.out.println();
        System.out.println();

        // * Search element in Linked list(Recursive way)
        System.out.println(ll.searchElement(2));
    }
}
