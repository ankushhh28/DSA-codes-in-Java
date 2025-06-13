import java.util.*;

public class reversenumber {
    public static void main(String[] args) {
        int num, rem;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse of Number: " + reverse);
    }

}
