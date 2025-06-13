import java.util.*;

public class greateroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter Value of Num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Value of Num2: ");
        num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is Greater than " + num2);
        else
            System.out.println(num2 + " is Greater than " + num1);

    }
}