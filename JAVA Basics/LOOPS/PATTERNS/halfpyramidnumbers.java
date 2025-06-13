import java.util.*;

public class halfpyramidnumbers {
    // 1234
    // 123
    // 12
    // 1
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 0;
            for (int j = n; j >= i; j--) {
                System.out.print(++num+" ");
            }
            System.out.println();
        }
    }

}
