public class digonalsum {

    public static int digonalsum(int matrix[][]) {
        int sum = 0;
        // BRUTE FORCE APPROACH---->O[n^2]

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {

        // // for primary digonal sum (i==j)
        // if (i == j) {
        // sum += matrix[i][j];
        // }

        // // for secondary digonal sum (i+j==n-1)
        // else if (i + j == matrix.length - 1) {
        // if (i != j) { // for avoiding repetation of sum of middle element in odd cases of n
        // sum += matrix[i][j];
        // }
        // }

        // }
        // }

        // OPTIMIZED APPROACH----> O[n]
        for (int i = 0; i < matrix.length; i++) {
            // primary digonal sum
            sum += matrix[i][i];
            // secondary digonal sum
            if (i != matrix.length - 1 - i) { // for avoiding repetation of elements in odd cases of n
                sum += matrix[i][matrix.length - 1 - i]; // As, i+j=n-1 --> j=n-1-i
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };
        System.out.println("Digonal Sum= " + digonalsum(matrix));
    }

}
