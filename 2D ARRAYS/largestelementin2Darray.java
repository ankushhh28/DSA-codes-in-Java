import java.util.*;

public class largestelementin2Darray {
    // function for search largest element in 2D array---
    public static int largestelement(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) { // for smallest element for < sign and set largest to Integer.MAX_VALUE
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];

        System.out.println("Enter elements in Array-");

        Scanner obj = new Scanner(System.in);
        // Input 2-D array----
        for (int i = 0; i < matrix.length; i++) { // total rows= matrix.length
            for (int j = 0; j < matrix[0].length; j++) { // total columns= matrix[0].length
                matrix[i][j] = obj.nextInt();
            }
        }

        System.out.println("Print Elements- ");

        // Output 2-D array----
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // call function for largest element
        System.out.println("Largest Element=" + (largestelement(matrix)));

    }
}
