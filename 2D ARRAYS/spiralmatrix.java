public class spiralmatrix {
    public static void printspiralmatrix(int matrix[][]) {
        // initialization of constraints
        int startRow = 0;
        int endRow = matrix.length - 1; // total no. of rows= matrix.length
        int startCol = 0;
        int endCol = matrix[0].length - 1; // total no. of columns= matrix[0].length

        // define loop for iteration for printing
        while (startRow <= endRow && startCol <= endCol) { // i--> row , j-->column

            // print top--> start row fix col change
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // print right--> end col fix row change
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // print bottom--> end row fix column change(decrease)
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) { // for avoid repetation of middle element in odd order case
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }

            // print left--> start col fix and row change(decrease)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { // for avoid repetation of middle element in odd order cases
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");

            }

            // updation of constraints--
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, // initialization syntax for 2-D array
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("Output of Spiral Matrix-");
        printspiralmatrix(matrix);
    }

}
