import java.util.ArrayList;

public class stackUsingArrayList {

    // Stack
    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int num) {
            list.add(num);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is Empty, can't pop");
            }
            return list.remove(list.size() - 1);
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is Empty, peek not exist");
            }
            return list.get(list.size() - 1);
        }
    }

    // main
    public static void main(String[] args) {
        Stack stack = new Stack();
        // for (int i = 1; i <= 10; i++) {
        // stack.push(i);
        // }
        // stack.pop();
        System.out.println("Top of Stack: " + stack.peek());
    }
}
