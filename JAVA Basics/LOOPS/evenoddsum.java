import java.util.*;

public class evenoddsum {
    public static void main(String[] args) {
        int num;
        int choice;
        int evensum = 0;
        int oddsum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter any Number: ");
            num = sc.nextInt();
            if (num % 2 == 0)
                evensum = evensum + num;
            else
                oddsum = oddsum + num;
            System.out.println("If you want to take more input then choose 1 else choose 0");

            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of Even Numbers: " + evensum);
        System.out.println("Sum of Odd Numbers: " + oddsum);
    }

}
