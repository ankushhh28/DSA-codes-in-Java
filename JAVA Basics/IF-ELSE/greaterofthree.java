import java.util.*;

public class greaterofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter Value of Num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Value of Num2: ");
        num2 = sc.nextInt();
        System.out.print("Enter Value of Num2: ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3)
                System.out.println(num1 + " is Greater");
            else
                System.out.println(num3 + " is Greater");
        } else if (num2 > num3)
            System.out.println(num2 + " is Greater");

        else
            System.out.println(num3 + " is Greater ");

    }
}