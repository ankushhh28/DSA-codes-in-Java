import java.util.*;

public class palindrome {

    public static int reversenum(int n) {
        int reverse = 0;
        while (n > 0) {
            int last = n % 10;
            reverse = (reverse * 10) + last;
            n = n / 10;
        }
        return reverse;

    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = sc.nextInt();

        if (num == reversenum(num))
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

}
