import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any Number: ");
        num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even ");
        else
            System.out.println(num + " is Odd ");

    }
}