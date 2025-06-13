import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        num= sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            fact= fact*i;
        }
        System.out.println("Factorial of "+num+" is: " +fact );
    }

}
