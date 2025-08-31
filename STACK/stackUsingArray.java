public class stackUsingArray {
    static class Stack {
        private int arr[] = new int[5];
        private int top = -1;

        // isEmpty
        public boolean isEmpty() {
            return top == -1;
        }

        // push
        public void push(int num) {
            if (top == arr.length - 1)
                throw new RuntimeException("Can't Insert, stack overflow");
            arr[++top] = num;
        }

        // pop
        public int pop() {
            if (isEmpty())
                return -1;
            return arr[top--];
        }

        // peek
        public int peek() {
            if (isEmpty())
                return -1;
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // push
        for (int i = 1; i <= 5; i++) {
            stack.push(i );
        }

        // push (overflow test)
        // stack.push(0);

        // peek
        System.out.println("Top of Stack: " + stack.peek());
    }
}
