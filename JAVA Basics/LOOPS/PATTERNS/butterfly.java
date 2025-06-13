
public class butterfly {

    public static void main(String[] args) {
        int n=8;
        // 1st half of butterfly pattern
        for (int i = 1; i <= n; i++) // outer loop
        {
            for (int j = 1; j <= i; j++) // for print * [in start]
            {
                System.out.print("*");
            }
            for (int sp = 1; sp <= 2 * (n - i); sp++) // for print spaces [no. of spaces in line 2*(n-i)]
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) // for print * [in end]
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half of butterfly pattern
        for (int i = n; i >= 1; i--) // outer loop
        {
            for (int j = 1; j <= i; j++) // for print * [in start]
            {
                System.out.print("*");
            }
            for (int sp = 1; sp <= 2 * (n - i); sp++) // for print spaces [no. of spaces in line 2*(n-i)]
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) // for print * [in end]
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
