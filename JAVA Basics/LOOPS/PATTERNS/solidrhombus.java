import java.util.Scanner;

public class solidrhombus {
    // *****
    // *****
    // *****
    // *****
    // *****

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) // no. of lines
        {
            for (int sp = 1; sp <= n - i; sp++) // for initial spaces
                System.out.print("-");
            for (int j = 1; j <= n; j++) // for print star
                System.out.print("*");
            System.out.println();
        }
    }

}
