public class stackUsingLinkedList {

    // Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack
    static class Stack {
        private Node head;

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int num) {
            Node temp = new Node(num);
            if (isEmpty()) {
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }

        // pop
        public int pop() {
            if (isEmpty())
                throw new RuntimeException("can't pop, Stack is Empty!");
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty())
                throw new RuntimeException("peek doesn't exist, Stack is Empty!");
            return head.data;
        }
    }

    // main
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
