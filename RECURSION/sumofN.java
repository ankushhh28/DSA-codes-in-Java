public class sumofN {
    public static int Calculatesum(int n) {
        if (n == 1) // Base class
            return 1;

        int sum = n + Calculatesum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum= " + Calculatesum(n));
    }
}
