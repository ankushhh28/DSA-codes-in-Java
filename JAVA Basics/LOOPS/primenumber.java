import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            System.out.println("Number " + n + " is not prime");
            sc.close();
            return;
        }

        for (int i = 2; i < n; i++) {
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
        sc.close();
    }
}