import java.util.*;

public class table {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n= sc.nextInt();
        System.out.println("Multiplication table of "+n+" is-");

        for(int i=1;i<=10;i++)
        {
            System.out.print(n*i+" ");
        }
    }
    
}
