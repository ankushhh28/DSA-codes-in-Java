import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            System.out.println("Number " + n + " is not prime");
            sc.close();
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) { // complexity decreases to square root of n...
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number " + n + " is prime");
        } else {
            System.out.println("Number " + n + " is not prime");
        }
    }

}
