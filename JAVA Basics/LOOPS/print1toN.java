import java.util.*;

public class print1toN {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        n = sc.nextInt();
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }

}
