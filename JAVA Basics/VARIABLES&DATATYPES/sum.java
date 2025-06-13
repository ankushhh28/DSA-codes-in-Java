import java.util.*;

//SUM OF TWO NUMBERS TAKING USER'S INPUT

public class sum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter Value of a=");
        a = obj.nextInt();
        System.out.print("Enter Value of b=");
        b = obj.nextInt();

        sum = a + b;

        System.out.print("Sum of a & b is :");
        System.out.print(sum);
    }
}