import java.util.*;
// multiple 0f 3 > fizz
// multiple of 5 > buzz
//multiple of 3&5 > fizz-buzz
// other cases > same number

public class fizzbuzzproblem {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = sc.nextInt();
        if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0 && n % 3 != 0) {
            System.out.println("Buzz");
        } else if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Fizz-Buzz");
        } else {
            System.out.println(n);
        }

    }
}
