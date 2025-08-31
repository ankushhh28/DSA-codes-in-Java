public class staircasesearch {

    // always use for sorted matrix row-wise and column-wise at same time

    public static boolean searchelement(int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1;
        // searching starts from top right case
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.print("Key found at index: (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else if (key > matrix[row][col]) {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    // searching starts from left bottom case

    public static boolean leftbottomsearch(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {

            if (key == matrix[row][col]) {
                System.out.print("Key found at index: (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else if (key > matrix[row][col]) {
                col++;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 40;

        // searchelement(matrix, key);
        leftbottomsearch(matrix, key);
    }

}
