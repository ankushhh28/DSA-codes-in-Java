import java.util.*;

//Average of three no's TAKING USER'S INPUT

public class average {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter Value of a:");
        a = obj.nextInt();

        System.out.print("Enter Value of b:");
        b = obj.nextInt();

        System.out.print("Enter Value of c:");
        c = obj.nextInt();

        float avg = (a + b + c) / 3;

        System.out.print("Average of a,b,c :" + avg);

    }
}