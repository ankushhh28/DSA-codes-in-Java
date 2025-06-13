public class print1ton {
    public static void print1toN(int n) {
        if (n == 10) { // Base case
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        print1toN(n + 1);
    }

    public static void print1toNway2(int n) {
        if (n == 1) {// Base case
            System.out.print(n + " ");
            return;
        }
        print1toNway2(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {
        int n1 = 1;
        int n2 = 10;
        print1toN(n1);
        System.out.println();
        print1toNway2(n2);
    }
}
