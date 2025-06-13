import java.util.*;

public class primeinrange {

    public static boolean primeoptimized(int n) { // optimized method for finding prime no.
        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static void checkprime(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeoptimized(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        checkprime(n);
    }

}
