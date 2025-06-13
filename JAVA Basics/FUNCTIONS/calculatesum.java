import java.util.*;

public class calculatesum {
    public static int SUM(int num1, int num2) { // parameters or formal parameters

        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        a = sc.nextInt();
        System.out.print("Enter number2: ");
        b = sc.nextInt();

        int sum = SUM(a, b); // arguments or actual parameters
        System.out.print("SUM = " + sum);
    }

}
