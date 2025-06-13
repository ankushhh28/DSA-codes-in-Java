public class prime {

    public static boolean isprime(int n) {
        if (n == 2) // corner case
            return true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static boolean primeoptimized(int n) { // optimized method for finding prime no.
        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isprime(6));
    }

}
