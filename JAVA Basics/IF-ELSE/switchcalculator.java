import java.util.*;

public class switchcalculator {

    public static void main(String[] args) {
        int a, b;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Enter your Operator[+,-,*,/]: ");
        operator = sc.next().charAt(0); // TO INPUT THE SINGLE CHATRACTER...

        switch (operator) {
            case '+':
                System.out.println("SUM= " + (a + b));
                break;
            case '-':
                System.out.println("DIFFERENCE= " + (a - b));
                break;
            case '*':
                System.out.println("PRODUCT= " + (a * b));
                break;
            case '/':
                System.out.println("DIVISION= " + (a / b));
                break;
            default:
                System.out.println("Invalid Operator");

        }

    }

}
