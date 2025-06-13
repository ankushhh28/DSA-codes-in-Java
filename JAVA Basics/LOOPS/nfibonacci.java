import java.util.*;

// FIBONACCI SERIES --> 0 1 2 3 5 8 13 ...
public class nfibonacci {
    public static void main(String[] args) {
        int n, c, a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series of " + n + " numbers -");
        System.out.print(a);
        System.out.print(" " + b);
        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

}
