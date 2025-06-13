import java.util.*;

public class sumofN{
    public static void main(String[] args) {
        int n,sum=0,i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        while (i <= n) {
            sum= sum+i;
            i++;
        }
        System.out.println("sum="+sum);
    }

}
