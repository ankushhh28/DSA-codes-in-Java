import java.util.*;

public class basics2Darray {
    // function for search element in 2D array
    public static boolean searchelement(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }

        System.out.println("Element not found");
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int key = 15;

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

        searchelement(matrix, key);

    }

}