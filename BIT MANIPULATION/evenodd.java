import java.util.*;

public class evenodd {
    public static void checkevenodd(int n) {
        int bitmask = 1; // operand we use with & operator
        if ((n & bitmask) == 0)
            System.out.println("Even Number");
        else if ((n & bitmask) == 1)
            System.out.println("Odd Number");

    }

    public static void main(String args[]) {
        int n;
        System.out.print("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        checkevenodd(n);
    }
}
