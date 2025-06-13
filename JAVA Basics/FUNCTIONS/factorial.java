import java.util.*;

public class factorial {
    public static int FACT(int num) { // parameters or formal parameters

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        int factorial = FACT(n); // arguments or actual parameters
        System.out.print("Factorial of number = " + factorial);
    }

}
