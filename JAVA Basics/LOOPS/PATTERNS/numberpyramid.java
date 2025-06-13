public class numberpyramid {

    public static void pyramid(int n) {
        // int total_lines = n;
        // int current_line = 1;
        // int stars = 1;
        // int num_print = 1;
        // int spaces = n - 1;
        // while (current_line <= total_lines) {
        //     // print spaces
        //     for (int i = 1; i <= spaces; i++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print(num_print + " ");
        //     }
        //     System.out.println();
        //     num_print++;
        //     stars++;
        //     spaces--;
        //     current_line++;
        // }

        for (int i = 1; i <= n; i++) {
            // PRINT SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // PRINT NUMBERS
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        pyramid(n);
    }
}
