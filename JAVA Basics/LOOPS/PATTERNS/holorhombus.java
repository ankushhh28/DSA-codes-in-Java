public class holorhombus {
    //     *****
    //    *   *
    //   *   *
    //  *   *
    // *****

    public static void main(String[] args) {

        int n = 3;
        for (int i = 1; i <= n; i++) // no. of lines
        {
            for (int sp = 1; sp <= n - i; sp++) // for initial spaces
                System.out.print("-");
            for (int j = 1; j <= n; j++) // for print star
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                    else
                    System.out.print(" ");
            System.out.println();
        }
    }

}
