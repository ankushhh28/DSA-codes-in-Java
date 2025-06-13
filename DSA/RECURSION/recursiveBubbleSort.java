public class recursiveBubbleSort {

    // Utility method to print the array
    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Recursive implementation of Bubble Sort with optimization.
     * 
     * @param arr The array to be sorted.
     * @param n   The number of elements remaining to sort.
     */
    public static void bubbleSort(int arr[], int n) {
        // * Base case: if only one element is left, then array is sorted
        if (n == 1)
            return;

        // * Boolean flag to check if any swap happened in this pass
        boolean check = false;

        // * Perform one complete pass of Bubble Sort for first 'n' elements
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                check = true;
            }
        }

        // * If no swaps happened in this pass, array is already sorted
        if (check == false)
            return;

        // * Recursive call to sort the remaining part of the array
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };

        // * Print array before sorting
        System.out.print("Before Sorting: ");
        printArray(arr);

        // * Perform recursive bubble sort
        bubbleSort(arr, arr.length);

        // * Print array after sorting
        System.out.print("After Sorting: ");
        printArray(arr);
    }
}
