import java.util.*;

public class taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income;
        float tax;
        System.out.print("Enter your Income: ");
        income = sc.nextInt();

        if (income < 500000) {
            tax = 0;
            System.out.println("Tax is 0%:" + tax);
        } else if ((500000 < income) && (income < 1000000)) {
            tax = 0.2f * income;
            System.out.println("Tax is 20%:" + tax);
        } else {
            tax = 0.3f * income;
            System.out.println("Tax is 30%:" + tax);
        }

    }
}