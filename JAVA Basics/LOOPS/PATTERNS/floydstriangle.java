
// FLOYD'S TRIANGLE PATTERN...
// 1
// 23
// 456
// 78910
import java.util.*;

public class floydstriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j - i <= 0)
                    System.out.print(count++);
            }
            System.out.println();
        }
    }

}
