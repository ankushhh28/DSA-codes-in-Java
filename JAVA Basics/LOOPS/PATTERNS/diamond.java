public class diamond {
    public static void main(String[] args) {

        int n = 3;
        // 1st half
        for (int i = 1; i <= n; i++) // outer loop
        {
            for (int sp = 1; sp <= n - i; sp++) // for spaces
            {
                System.out.print("-");
            }
            for (int j = 1; j <= (2 * i - 1); j++) // for print odd no. of stars[ odd no= 2x+1 or 2x-1]
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) // outer loop
        {
            for (int sp = 1; sp <= n - i; sp++) // for spaces
            {
                System.out.print("-");
            }
            for (int j = 1; j <= (2 * i - 1); j++) // for print odd no. of stars[ odd no= 2x+1 or 2x-1]
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
