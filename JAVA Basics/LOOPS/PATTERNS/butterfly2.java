public class butterfly2 {
    public static void butterfly(int n) {
        int total_lines = 2 * n - 1;
        int current_line = 1;
        int stars = 1;
        int spaces = 2 * n - 2;
        while (current_line <= total_lines) {
            // print stars
            for (int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }
            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // print stars
            for (int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
            // updation for next lines
            if (current_line <n) {
                stars++;
                spaces=spaces-2;
            } else {
                stars--;
                spaces= spaces+2;
            }
            current_line++;
        }

    }

    public static void main(String[] args) {
        int n = 4;
        butterfly(n);
    }

}