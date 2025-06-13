import java.util.*;

public class positivenegative {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        num = sc.nextInt();

        String status = (num > 0) ? "No. is Positive" : "No. is Negative";
        System.out.println(status);
    }

}
